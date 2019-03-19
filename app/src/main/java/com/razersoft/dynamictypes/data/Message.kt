package com.razersoft.dynamictypes.data

import com.razersoft.dynamictypes.data.interfaces.WithPayload
import com.razersoft.dynamictypes.data.interfaces.BasePayload
import com.razersoft.dynamictypes.data.payloads.MainPayload
import com.razersoft.dynamictypes.data.types.MessageType
import com.razersoft.dynamictypes.data.types.TypeConverter
import io.objectbox.annotation.Convert
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

/**
 * Created by sergey.vrublevsky on 3/19/19
 */

@Entity
data class Message<T : BasePayload>(
    @Id
    var id: Long,
    @Convert(converter = TypeConverter::class, dbType = String::class)
    val messageType: MessageType<T>,
    val mainPayload: MainPayload) : WithPayload<T> by messageType {

    fun getPayload(): T {
        return getPayload(mainPayload)
    }
}