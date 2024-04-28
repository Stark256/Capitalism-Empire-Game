package com.capitalism.empire.feature.collections

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
import com.capitalism.empire.feature.collections.CollectionsViewModel
import moe.tlaster.precompose.koin.koinViewModel

@Composable
fun CollectionsScreen(
    bottomBarPaddings: PaddingValues,
    modifier: Modifier = Modifier,
    viewModel: CollectionsViewModel = koinViewModel(CollectionsViewModel::class)
) {
    val paddings = remember { bottomBarPaddings }

    Column(
        modifier = modifier.fillMaxSize().padding(paddings),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Collections Screen")
    }
}