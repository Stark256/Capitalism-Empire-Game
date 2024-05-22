package resources

import com.capitalism.empire.core.ui.resources.ResourceIcons
import com.capitalism.empire.core.ui.resources.icons.ResourceIconsWallet
import com.capitalism.empire.core.ui.resources.icons.ResourceIconsTabs
import resources.icons.ResourceIconsWalletImpl
import resources.icons.ResourceIconsTabsImpl

object ResourceIconsImpl: ResourceIcons {
    override val tabs: ResourceIconsTabs = ResourceIconsTabsImpl
    override val wallet: ResourceIconsWallet = ResourceIconsWalletImpl
}