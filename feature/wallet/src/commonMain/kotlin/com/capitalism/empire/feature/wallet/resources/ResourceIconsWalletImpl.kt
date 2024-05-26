package com.capitalism.empire.feature.wallet.resources

import com.capitalism.empire.core.ui.resources.Resources
import com.capitalism.empire.core.ui.resources.icons.ResourceIconsWallet
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
class ResourceIconsWalletImpl(val resources: Resources): ResourceIconsWallet {
    override val mastercard: DrawableResource = resources.icons.mastercard
    override val visa_black: DrawableResource = resources.icons.visa_black
    override val visa_white: DrawableResource = resources.icons.visa_white
    override val add_circle: DrawableResource = resources.icons.add_circle
    override val transfer: DrawableResource = resources.icons.transfer
    override val settings: DrawableResource = resources.icons.settings
}