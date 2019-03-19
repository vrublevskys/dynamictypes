package com.razersoft.dynamictypes.data.types

/**
 * Created by sergey.vrublevsky on 3/19/19
 */

sealed class MessageType(val value: String) {

    object Video : MessageType("Video")

    object Image : MessageType("Image")

    companion object {

        fun fromString(string: String?): MessageType {
            return when(string) {
                "Video" -> Video
                "Image" -> Image
                else -> throw IllegalArgumentException("Unknown type $string")
            }
        }
    }
}