package com.razersoft.dynamictypes.data.types

import io.objectbox.converter.PropertyConverter

/**
 * Created by sergey.vrublevsky on 3/19/19
 */

class TypeConverter : PropertyConverter<MessageType<*>, String>{

    override fun convertToDatabaseValue(entityProperty: MessageType<*>?): String {
        return entityProperty?.value ?: "Unknown"
    }

    override fun convertToEntityProperty(databaseValue: String?): MessageType<*> {
        return MessageType.fromString(databaseValue)
    }
}