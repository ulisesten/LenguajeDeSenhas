package com.example.lenguajedeseas

import android.util.Log
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import com.google.mlkit.vision.common.InputImage

class Utils {

    fun debugInfo(tag: String, value: String){
        Log.d("***************DEBUG: $tag******************", value)
    }
}


