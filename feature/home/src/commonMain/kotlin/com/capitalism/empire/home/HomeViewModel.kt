package com.capitalism.empire.home

import com.capitalism.empire.ui.BottomBarItems
import com.capitalism.empire.ui.BottomBarMenuItem
import moe.tlaster.precompose.viewmodel.ViewModel

class HomeViewModel(
    private val bottomBarMenuItems: BottomBarItems
): ViewModel() {

    val investingMenuItem: BottomBarMenuItem = bottomBarMenuItems.INVESTING
    val businessMenuItem: BottomBarMenuItem = bottomBarMenuItems.BUSINESS
    val walletMenuItem: BottomBarMenuItem = bottomBarMenuItems.WALLET
    val collectionsMenuItem: BottomBarMenuItem = bottomBarMenuItems.COLLECTIONS
    val profileMenuItem: BottomBarMenuItem = bottomBarMenuItems.PROFILE

    val defaultMenuItem: BottomBarMenuItem = walletMenuItem
    val bottomMenuItems: List<BottomBarMenuItem> = listOf(
        investingMenuItem,
        businessMenuItem,
        walletMenuItem,
        collectionsMenuItem,
        profileMenuItem
    )

}