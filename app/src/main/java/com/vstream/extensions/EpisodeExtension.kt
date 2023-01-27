package com.vstream.extensions

import com.vstream.constants.IMAGE_BASE_URL
import com.vstream.constants.ImageSize
import com.vstream.data_models.Episode

fun Episode.getStillUrl(size: ImageSize = ImageSize.ORIGINAL): String {
    return "$IMAGE_BASE_URL${size.value}${this.stillPath}"
}
