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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.capitalism.empire.core.ui.components.HorizontalPageIndicator
import com.capitalism.empire.core.ui.resources.icons.ResourceIconsWallet
import com.capitalism.empire.data.wallet.components.NewCardButton
import com.capitalism.empire.data.wallet.components.WalletCard
import com.capitalism.empire.data.wallet.models.CardUIDetails
import com.capitalism.empire.data.wallet.models.CardUi
import moe.tlaster.precompose.koin.koinViewModel
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun WalletScreen(
    bottomBarPaddings: PaddingValues,
    viewModel: WalletViewModel = koinViewModel(WalletViewModel::class)
) {
    val state by viewModel.uiState.collectAsState()

    WalletContent(
        state = state,
        icons = viewModel.icons,
        onAddNewCardClicked = viewModel::onAddNewCardClicked,
        onCardSettingsClicked = viewModel::onCardSettingsClicked,
        bottomBarPaddings = bottomBarPaddings
    )
}

@OptIn(ExperimentalFoundationApi::class, ExperimentalResourceApi::class)
@Composable
fun WalletContent(
    state: WalletUiState,
    icons: ResourceIconsWallet,
    bottomBarPaddings: PaddingValues,
    onAddNewCardClicked: () -> Unit,
    onCardSettingsClicked: (CardUIDetails) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(bottomBarPaddings)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            // Tips Dialog Button
            // TODO fix icon
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
            // TODO fix icon
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
                        iconCardSettings = ,
                        onCardSettingsClicked = {
                            onCardSettingsClicked.invoke(cardUI.cardDetails)
                        }
                    )
                }
                is CardUi.AddNewCard -> {
                    NewCardButton(
                        iconAddNewCard = ,
                        onAddNewCardClicked = {
                            onAddNewCardClicked.invoke()
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
