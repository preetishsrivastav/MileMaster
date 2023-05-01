package com.example.milemaster.roomdb

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream
import java.io.OutputStream

class Converters {

    @TypeConverter
    fun fromBitmap(bmp:Bitmap):ByteArray{
        val outputStream= ByteArrayOutputStream()
         bmp.compress(Bitmap.CompressFormat.PNG,100,outputStream)
        return outputStream.toByteArray()

    }
    @TypeConverter
    fun toBitmap(bytes:ByteArray):Bitmap{
       return BitmapFactory.decodeByteArray(bytes,0,bytes.size)

    }


}