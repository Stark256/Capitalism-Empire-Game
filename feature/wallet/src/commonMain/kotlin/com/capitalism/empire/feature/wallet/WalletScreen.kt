package com.capitalism.empire.feature.wallet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.capitalism.empire.cards.CreditCardsList
import com.capitalism.empire.feature.wallet.WalletViewModel
import moe.tlaster.precompose.koin.koinViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
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
}