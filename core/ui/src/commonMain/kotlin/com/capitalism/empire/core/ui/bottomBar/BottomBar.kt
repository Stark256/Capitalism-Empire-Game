package com.capitalism.empire.ui.bottomBar

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun BottomBar(
    menuItems: MenuItemsList,
    onMenuItemClicked: (BottomBarMenuItem) -> Unit,
    currentMenuItem: BottomBarMenuItem?,
    modifier: Modifier = Modifier
) {
    NavigationBar(modifier = modifier) {
        menuItems.items.forEach { menuItem ->
            NavigationBarItem(
                selected = menuItem == currentMenuItem,
                onClick = { onMenuItemClicked(menuItem) },
                icon = {
                    Icon(
                        painter = painterResource(menuItem.iconId),
                        contentDescription = null
                    )
                       },
                label = {
                    Text(
                        text = stringResource(menuItem.textId)
                    )
                }
            )
        }
    }
}

@Immutable
data class MenuItemsList(val items: List<BottomBarMenuItem>)