package com.capitalism.empire.ui

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource

@OptIn(ExperimentalResourceApi::class)
data class BottomBarMenuItem(
   val iconId: DrawableResource,
   val textId: StringResource
)

interface BottomBarItems {
   val INVESTING: BottomBarMenuItem
   val BUSINESS: BottomBarMenuItem
   val WALLET: BottomBarMenuItem
   val COLLECTIONS: BottomBarMenuItem
   val PROFILE: BottomBarMenuItem
}
