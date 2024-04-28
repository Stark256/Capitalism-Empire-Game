package resources

import com.capitalism.empire.core.ui.resources.ResourceIcons
import com.capitalism.empire.core.ui.resources.icons.ResourceIconsCards
import com.capitalism.empire.core.ui.resources.icons.ResourceIconsTabs
import resources.icons.ResourceIconsCardsImpl
import resources.icons.ResourceIconsTabsImpl

object ResourceIconsImpl: ResourceIcons {
    override val tabs: ResourceIconsTabs = ResourceIconsTabsImpl
    override val cards: ResourceIconsCards = ResourceIconsCardsImpl
}