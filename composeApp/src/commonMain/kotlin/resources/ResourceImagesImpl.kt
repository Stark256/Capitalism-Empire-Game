package resources

import com.capitalism.empire.core.ui.resources.ResourceImages
import com.capitalism.empire.core.ui.resources.images.ResourceImagesCards
import resources.images.ResourceImagesCardsImpl

object ResourceImagesImpl: ResourceImages {
    override val cards: ResourceImagesCards = ResourceImagesCardsImpl
}