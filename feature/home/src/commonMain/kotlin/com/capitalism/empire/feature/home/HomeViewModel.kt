package com.capitalism.empire.feature.home

import com.capitalism.empire.core.ui.bottomBar.BottomBarMenuItem
import com.capitalism.empire.core.ui.resources.Resources
import com.capitalism.empire.core.ui.resources.icons.ResourceIconsTabs
import com.capitalism.empire.core.ui.resources.strings.ResourceStringsTabs
import moe.tlaster.precompose.viewmodel.ViewModel
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
class HomeViewModel(
    val icons: ResourceIconsTabs,
    val strings: ResourceStringsTabs
): ViewModel() {

    val investingMenuItem = BottomBarMenuItem(
        iconId = icons.investing,
        textId = strings.investing
    )
    val businessMenuItem = BottomBarMenuItem(
        iconId = icons.business,
        textId = strings.business
    )
    val walletMenuItem = BottomBarMenuItem(
        iconId = icons.wallet,
        textId = strings.wallet
    )
    val collectionsMenuItem = BottomBarMenuItem(
        iconId = icons.collections,
        textId = strings.collections
    )
    val profileMenuItem = BottomBarMenuItem(
        iconId = icons.profile,
        textId = strings.profile
    )

    val defaultMenuItem: BottomBarMenuItem = walletMenuItem
    val bottomMenuItems: List<BottomBarMenuItem> = listOf(
        investingMenuItem,
        businessMenuItem,
        walletMenuItem,
        collectionsMenuItem,
        profileMenuItem
    )

}