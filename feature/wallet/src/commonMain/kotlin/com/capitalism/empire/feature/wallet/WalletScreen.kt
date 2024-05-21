package com.capitalism.empire.feature.wallet

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.capitalism.empire.cards.CreditCardsList
import com.capitalism.empire.core.ui.components.HorizontalPageIndicator
import com.capitalism.empire.data.wallet.components.NewCardButton
import com.capitalism.empire.data.wallet.components.WalletCard
import com.capitalism.empire.data.wallet.models.CardUIDetails
import com.capitalism.empire.data.wallet.models.CardUi
import com.capitalism.empire.feature.wallet.WalletViewModel
import moe.tlaster.precompose.koin.koinViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

/*@Composable
@Preview
fun WalletScreen(
    bottomBarPaddings: PaddingValues,
    modifier: Modifier = Modifier,
    viewModel: WalletViewModel = koinViewModel(WalletViewModel::class)
) {
    val paddings = remember { bottomBarPaddings }

    Column(
        modifier = modifier.fillMaxSize().padding(paddings),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Wallet Screen")
        CreditCardsList()
    }
}*/

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun WalletScreen(
    bottomBarPaddings: PaddingValues,
    modifier: Modifier = Modifier,
    state: WalletScreenState,
    viewModel: WalletViewModel = koinViewModel(WalletViewModel::class)
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            // Tips Dialog Button
            Icon(
                painter = rememberVectorPainter(Icons.Default.AccountCircle),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 16.dp)
                    .size(24.dp)
                    .clickable {
                        // TODO onCLick
                    }
            )

            // Transfer Money Button
            Icon(
                painter = rememberVectorPainter(Icons.Default.Settings),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .clickable {
                        // TODO onClick
                    }
            )
        }

        val pagerState = rememberPagerState {
            state.cards.size
        }

        HorizontalPager(
            state = pagerState,
            pageSpacing = (-24).dp,
        ) {page ->
            val cardUI = state.cards[page]
            when(cardUI) {
                is CardUi.Card -> {
                    WalletCard(
                        cardDetails = cardUI.cardDetails,
                        onCardSettingsClicked = {}
                    )
                }
                is CardUi.AddNewCard -> {
                    NewCardButton(
                        onAddNewCardClicked = {
                            // TODO
                        }
                    )
                }
            }
        }

        HorizontalPageIndicator(
            pageCount = pagerState.pageCount,
            currentPage = pagerState.currentPage,
            targetPage = pagerState.targetPage,
            currentPageOffsetFraction = pagerState.currentPageOffsetFraction,
            modifier = Modifier.fillMaxWidth()
        )


    }
}

val walletState = WalletScreenState(
    cards = listOf(
        CardUi.Card(
            cardDetails = CardUIDetails(
                cardId = 1,
                balance = "$10,000",
                accountType = "Checking Account",
                number = "****  ****  ****  2345",
                expiration = "12/26",
                cardIcon = R.drawable.ic_mastercard,
                cardBackground = R.drawable.card_design_1
            )
        ),
        CardUi.Card(
            cardDetails = CardUIDetails(
                cardId = 2,
                balance = "$25,000",
                accountType = "Deposit Account",
                number = "****  ****  ****  7895",
                expiration = "08/28",
                cardIcon = R.drawable.ic_visa_white,
                cardBackground = R.drawable.card_design_2
            )
        ),
        CardUi.Card(
            cardDetails = CardUIDetails(
                cardId = 3,
                balance = "$18,000,000,000,000,000,000",
                accountType = "Credit Account",
                number = "****  ****  ****  7895",
                expiration = "08/28",
                cardIcon = R.drawable.ic_visa_black,
                cardBackground = R.drawable.card_design_3
            )
        ),
        CardUi.Card(
            cardDetails = CardUIDetails(
                cardId = 3,
                balance = "$18,000,000,000,000,000,000",
                accountType = "Credit Account",
                number = "****  ****  ****  7895",
                expiration = "08/28",
                cardIcon = R.drawable.ic_visa_black,
                cardBackground = R.drawable.card_design_4
            )
        ),
        CardUi.AddNewCard
    )
)

@Composable
@Preview
fun WalletScreenPreview() {
    MaterialTheme {
        Column(
            modifier = Modifier.background(color = Color.White)
        ) {
            WalletScreen(state = walletState)
        }
    }
}