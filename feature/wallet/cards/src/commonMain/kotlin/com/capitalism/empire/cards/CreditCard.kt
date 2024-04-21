package com.capitalism.empire.cards

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun CreditCard(
    card: Card,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(card.drawable),
        contentDescription = null
    )
}
