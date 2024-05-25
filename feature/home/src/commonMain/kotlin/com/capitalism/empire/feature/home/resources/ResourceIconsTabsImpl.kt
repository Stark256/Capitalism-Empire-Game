package com.capitalism.empire.feature.home.resources

import com.capitalism.empire.core.ui.resources.Resources
import com.capitalism.empire.core.ui.resources.icons.ResourceIconsTabs
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
class ResourceIconsTabsImpl(val resources: Resources): ResourceIconsTabs {
    override val business: DrawableResource = resources.icons.business
    override val collections: DrawableResource = resources.icons.collections
    override val investing: DrawableResource = resources.icons.investing
    override val profile: DrawableResource = resources.icons.profile
    override val wallet: DrawableResource = resources.icons.wallet
}