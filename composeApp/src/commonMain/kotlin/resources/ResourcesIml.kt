package resources

import com.capitalism.empire.ui.resources.ResourceIcons
import com.capitalism.empire.ui.resources.ResourceImages
import com.capitalism.empire.ui.resources.ResourceStrings
import com.capitalism.empire.ui.resources.Resources

object ResourcesIml: Resources {
    override val icons: ResourceIcons = ResourceIconsImpl
    override val images: ResourceImages = ResourceImagesImpl
    override val strings: ResourceStrings = ResourceStringsImpl
}