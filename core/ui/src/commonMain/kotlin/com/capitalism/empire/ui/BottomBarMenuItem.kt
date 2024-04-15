package com.capitalism.empire.ui

import capitalismempire.core.ui.generated.resources.Res
import capitalismempire.core.ui.generated.resources.home_menu_item_business
import capitalismempire.core.ui.generated.resources.home_menu_item_collections
import capitalismempire.core.ui.generated.resources.home_menu_item_investing
import capitalismempire.core.ui.generated.resources.home_menu_item_profile
import capitalismempire.core.ui.generated.resources.home_menu_item_wallet
import capitalismempire.core.ui.generated.resources.ic_business
import capitalismempire.core.ui.generated.resources.ic_collections
import capitalismempire.core.ui.generated.resources.ic_investing
import capitalismempire.core.ui.generated.resources.ic_profile
import capitalismempire.core.ui.generated.resources.ic_wallet
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource

@OptIn(ExperimentalResourceApi::class)
enum class BottomBarMenuItem(
   val iconId: DrawableResource,
   val textId: StringResource
) {
   INVESTING(
      iconId = Res.drawable.ic_investing,
      textId = Res.string.home_menu_item_investing
   ),
   BUSINESS(
      iconId = Res.drawable.ic_business,
      textId = Res.string.home_menu_item_business
   ),
   WALLET(
      iconId = Res.drawable.ic_wallet,
      textId = Res.string.home_menu_item_wallet
   ),
   COLLECTION(
      iconId = Res.drawable.ic_collections,
      textId = Res.string.home_menu_item_collections
   ),
   PROFILE(
      iconId = Res.drawable.ic_profile,
      textId = Res.string.home_menu_item_profile
   )
}
