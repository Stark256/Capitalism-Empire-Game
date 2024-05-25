package com.capitalism.empire.feature.home.resources

import com.capitalism.empire.core.ui.resources.Resources
import com.capitalism.empire.core.ui.resources.strings.ResourceStringsTabs
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource

@OptIn(ExperimentalResourceApi::class)
class ResourceStringsTabsImpl(val resources: Resources): ResourceStringsTabs {
    override val investing: StringResource = resources.strings.investing
    override val business: StringResource = resources.strings.business
    override val wallet: StringResource = resources.strings.wallet
    override val collections: StringResource = resources.strings.collections
    override val profile: StringResource = resources.strings.profile
}