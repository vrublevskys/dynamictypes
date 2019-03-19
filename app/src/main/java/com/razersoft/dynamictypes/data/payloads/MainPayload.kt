package com.razersoft.dynamictypes.data.payloads

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

/**
 * Created by sergey.vrublevsky on 3/19/19
 */

@Entity
data class MainPayload(
    @Id var id: Long,
    var mvideoUrl: String,
    var mimageUrl: String
) : VideoPayload, ImagePayload {

    override fun getVideoUrl(): String {
        return mvideoUrl
    }

    override fun getImageUrl(): String {
        return mimageUrl
    }
}