package com.capitalism.empire.core.ui.resources

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
interface ResourceIcons {
    // Bottom Bar
    val business: DrawableResource
    val collections: DrawableResource
    val investing: DrawableResource
    val profile: DrawableResource
    val wallet: DrawableResource

    // Wallet
    val mastercard: DrawableResource
    val visa_black: DrawableResource
    val visa_white: DrawableResource
    val add_circle: DrawableResource
    val transfer: DrawableResource
    val settings: DrawableResource
}
