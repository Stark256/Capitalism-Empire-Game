package com.capitalism.empire.feature.business

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
import com.capitalism.empire.feature.business.BusinessViewModel
import moe.tlaster.precompose.koin.koinViewModel

@Composable
fun BusinessScreen(
    bottomBarPaddings: PaddingValues,
    modifier: Modifier = Modifier,
    viewModel: BusinessViewModel = koinViewModel(BusinessViewModel::class)
) {
    val paddings = remember { bottomBarPaddings }

    Column(
        modifier = modifier.fillMaxSize().padding(paddings),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Business Screen")
    }
}