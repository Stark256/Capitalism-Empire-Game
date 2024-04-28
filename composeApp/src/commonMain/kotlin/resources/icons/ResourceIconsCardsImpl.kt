package resources.icons

import capitalismempire.composeapp.generated.resources.Res
import capitalismempire.composeapp.generated.resources.*
import com.capitalism.empire.core.ui.resources.icons.ResourceIconsCards
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
object ResourceIconsCardsImpl: ResourceIconsCards {
    override val chip_yellow: DrawableResource = Res.drawable.ic_chip_yellow
    override val connect_black: DrawableResource = Res.drawable.ic_connect_black
    override val connect_white: DrawableResource = Res.drawable.ic_connect_white
    override val mastercard: DrawableResource = Res.drawable.ic_mastercard
    override val mastercard_white: DrawableResource = Res.drawable.ic_mastercard_white
    override val visa_black: DrawableResource = Res.drawable.ic_visa_black
    override val visa_white: DrawableResource = Res.drawable.ic_visa_white
}