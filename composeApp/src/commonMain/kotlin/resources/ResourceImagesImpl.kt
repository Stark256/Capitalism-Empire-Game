package resources

import com.capitalism.empire.core.ui.resources.ResourceImages
import com.capitalism.empire.core.ui.resources.images.ResourceImagesWallet
import resources.images.ResourceImagesWalletImpl

object ResourceImagesImpl: ResourceImages {
    override val cards: ResourceImagesWallet = ResourceImagesWalletImpl
}