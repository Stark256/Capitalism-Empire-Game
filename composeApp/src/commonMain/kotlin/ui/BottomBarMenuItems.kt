package ui

import capitalismempire.composeapp.generated.resources.Res
import capitalismempire.composeapp.generated.resources.*
import com.capitalism.empire.ui.BottomBarItems
import com.capitalism.empire.ui.BottomBarMenuItem
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
object BottomBarMenuItems: BottomBarItems {
    override val INVESTING = BottomBarMenuItem(
        iconId = Res.drawable.ic_investing,
        textId = Res.string.home_menu_item_investing
    )

    override val BUSINESS = BottomBarMenuItem(
        iconId = Res.drawable.ic_business,
        textId = Res.string.home_menu_item_business
    )

    override val WALLET = BottomBarMenuItem(
        iconId = Res.drawable.ic_wallet,
        textId = Res.string.home_menu_item_wallet
    )

    override val COLLECTIONS = BottomBarMenuItem(
        iconId = Res.drawable.ic_collections,
        textId = Res.string.home_menu_item_collections
    )

    override val PROFILE = BottomBarMenuItem(
        iconId = Res.drawable.ic_profile,
        textId = Res.string.home_menu_item_profile
    )

    override val defaultMenuItem = WALLET

    override val menuItems = listOf(
        INVESTING,
        BUSINESS,
        WALLET,
        COLLECTIONS,
        PROFILE
    )
}