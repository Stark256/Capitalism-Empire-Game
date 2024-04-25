package com.capitalism.empire.home

import com.capitalism.empire.ui.bottomBar.BottomBarMenuItem
import com.capitalism.empire.ui.resources.Resources
import moe.tlaster.precompose.viewmodel.ViewModel
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
class HomeViewModel(
    private val resources: Resources
): ViewModel() {

    val investingMenuItem: BottomBarMenuItem = BottomBarMenuItem(
        iconId = resources.icons.tabs.investing,
        textId = resources.strings.tabs.investing
    )
    val businessMenuItem: BottomBarMenuItem = BottomBarMenuItem(
        iconId = resources.icons.tabs.business,
        textId = resources.strings.tabs.business
    )
    val walletMenuItem: BottomBarMenuItem = BottomBarMenuItem(
        iconId = resources.icons.tabs.wallet,
        textId = resources.strings.tabs.wallet
    )
    val collectionsMenuItem: BottomBarMenuItem = BottomBarMenuItem(
        iconId = resources.icons.tabs.collections,
        textId = resources.strings.tabs.collections
    )
    val profileMenuItem: BottomBarMenuItem = BottomBarMenuItem(
        iconId = resources.icons.tabs.profile,
        textId = resources.strings.tabs.profile
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