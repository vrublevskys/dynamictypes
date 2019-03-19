package com.razersoft.dynamictypes.data.payloads

import com.razersoft.dynamictypes.data.interfaces.BasePayload

/**
 * Created by sergey.vrublevsky on 3/19/19
 */

interface VideoPayload : BasePayload {

    fun getVideoUrl(): String
}