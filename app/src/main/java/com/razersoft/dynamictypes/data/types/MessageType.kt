package com.razersoft.dynamictypes.data.types

import com.razersoft.dynamictypes.data.interfaces.WithPayload
import com.razersoft.dynamictypes.data.interfaces.BasePayload
import com.razersoft.dynamictypes.data.payloads.ImagePayload
import com.razersoft.dynamictypes.data.payloads.MainPayload
import com.razersoft.dynamictypes.data.payloads.VideoPayload
import java.lang.IllegalArgumentException

/**
 * Created by sergey.vrublevsky on 3/19/19
 */

sealed class MessageType<T : BasePayload>(val value: String) : WithPayload<T> {

    object Video : MessageType<VideoPayload>("Video") {
        override fun getPayload(mainPayload: MainPayload): VideoPayload {
            return mainPayload
        }
    }

    object Image : MessageType<ImagePayload>("Image") {
        override fun getPayload(mainPayload: MainPayload): ImagePayload {
            return mainPayload
        }
    }

    companion object {

        fun fromString(string: String?): MessageType<*> {
            return when(string) {
                "Video" -> Video
                "Image" -> Image
                else -> throw IllegalArgumentException("Unknown type $string")
            }
        }
    }
}