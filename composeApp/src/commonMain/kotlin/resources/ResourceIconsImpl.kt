package resources

import capitalismempire.composeapp.generated.resources.Res
import capitalismempire.composeapp.generated.resources.*
import com.capitalism.empire.core.ui.resources.ResourceIcons
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
object ResourceIconsImpl: ResourceIcons {
    // Bottom Bar
    override val business: DrawableResource = Res.drawable.ic_business
    override val collections: DrawableResource = Res.drawable.ic_collections
    override val investing: DrawableResource = Res.drawable.ic_investing
    override val profile: DrawableResource = Res.drawable.ic_profile
    override val wallet: DrawableResource = Res.drawable.ic_wallet

    // Wallet
    override val mastercard: DrawableResource = Res.drawable.ic_mastercard
    override val visa_black: DrawableResource = Res.drawable.ic_visa_black
    override val visa_white: DrawableResource = Res.drawable.ic_visa_white
    override val add_circle: DrawableResource = Res.drawable.ic_add_circle
    override val transfer: DrawableResource = Res.drawable.ic_transfer
    override val settings: DrawableResource = Res.drawable.ic_settings
}