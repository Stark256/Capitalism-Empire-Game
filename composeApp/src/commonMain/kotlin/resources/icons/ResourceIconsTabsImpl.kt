package resources.icons

import capitalismempire.composeapp.generated.resources.Res
import capitalismempire.composeapp.generated.resources.*
import com.capitalism.empire.core.ui.resources.icons.ResourceIconsTabs
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
object ResourceIconsTabsImpl: ResourceIconsTabs {
    override val business: DrawableResource = Res.drawable.ic_business
    override val collections: DrawableResource = Res.drawable.ic_collections
    override val investing: DrawableResource = Res.drawable.ic_investing
    override val profile: DrawableResource = Res.drawable.ic_profile
    override val wallet: DrawableResource = Res.drawable.ic_wallet
}