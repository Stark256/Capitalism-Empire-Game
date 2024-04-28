package resources

import com.capitalism.empire.core.ui.resources.ResourceIcons
import com.capitalism.empire.core.ui.resources.ResourceImages
import com.capitalism.empire.core.ui.resources.ResourceStrings
import com.capitalism.empire.core.ui.resources.Resources

object ResourcesIml: Resources {
    override val icons: ResourceIcons = ResourceIconsImpl
    override val images: ResourceImages = ResourceImagesImpl
    override val strings: ResourceStrings = ResourceStringsImpl
}