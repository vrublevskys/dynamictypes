package com.razersoft.dynamictypes.data.interfaces

import com.razersoft.dynamictypes.data.payloads.MainPayload

/**
 * Created by sergey.vrublevsky on 3/19/19
 */

interface WithPayload<T : BasePayload> {

    fun getPayload(mainPayload: MainPayload): T
}