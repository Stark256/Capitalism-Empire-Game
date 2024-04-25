package com.capitalism.empire.investing

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
import moe.tlaster.precompose.koin.koinViewModel

@Composable
fun InvestingScreen(
    bottomBarPaddings: PaddingValues,
    modifier: Modifier = Modifier,
    viewModel: InvestingViewModel = koinViewModel(InvestingViewModel::class)
) {
    val paddings = remember { bottomBarPaddings }

    Column(
        modifier = modifier.fillMaxSize().padding(paddings),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Investing Screen")
    }
}