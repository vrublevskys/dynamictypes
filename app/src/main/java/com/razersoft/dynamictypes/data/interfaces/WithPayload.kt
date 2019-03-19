package com.razersoft.dynamictypes.data.interfaces

/**
 * Created by sergey.vrublevsky on 3/19/19
 */

interface WithPayload<T : BasePayload> {

    fun getPayload(): T
}