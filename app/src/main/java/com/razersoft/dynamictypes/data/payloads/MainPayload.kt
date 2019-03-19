package com.razersoft.dynamictypes.data.payloads

/**
 * Created by sergey.vrublevsky on 3/19/19
 */

data class MainPayload(val mvideoUrl: String, private val mimageUrl: String) : VideoPayload, ImagePayload {

    override fun getVideoUrl(): String {
        return mvideoUrl
    }

    override fun getImageUrl(): String {
        return mimageUrl
    }
}