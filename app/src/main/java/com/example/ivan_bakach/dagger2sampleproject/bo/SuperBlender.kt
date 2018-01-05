package com.example.ivan_bakach.dagger2sampleproject.bo

import android.util.Log

import com.example.ivan_bakach.dagger2sampleproject.constants.CommonConstants

internal class SuperBlender : Blender {

    override fun blend() {
        Log.d(CommonConstants.TAG, "blend:  ")
    }
}
