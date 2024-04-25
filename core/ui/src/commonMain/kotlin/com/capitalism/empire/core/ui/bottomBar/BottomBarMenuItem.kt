package com.capitalism.empire.ui.bottomBar

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource

@OptIn(ExperimentalResourceApi::class)
data class BottomBarMenuItem(
    val iconId: DrawableResource,
    val textId: StringResource
)