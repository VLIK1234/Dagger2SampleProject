package com.example.ivan_bakach.dagger2sampleproject.bo

import android.util.Log
import com.example.ivan_bakach.dagger2sampleproject.constants.CommonConstants
import dagger.Lazy
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class IceCreamMaker @Inject constructor(private val fridge: Lazy<Fridge>, private val blender: Blender) {

    fun make() {
        blender.blend()
        fridge.get().on()
        Log.d(CommonConstants.TAG, "Was made Nice Ice cream")
        fridge.get().off()
    }
}