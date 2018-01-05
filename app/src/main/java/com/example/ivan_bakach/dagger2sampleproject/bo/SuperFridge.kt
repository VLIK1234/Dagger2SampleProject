package com.example.ivan_bakach.dagger2sampleproject.bo

import android.util.Log
import com.example.ivan_bakach.dagger2sampleproject.constants.CommonConstants

internal class SuperFridge : Fridge {

    private var isFreeze: Boolean = false

    override fun on() {
        Log.d(CommonConstants.TAG, "freeze: ")
        isFreeze = true
    }

    override fun off() {
        isFreeze = false
    }

    override fun isFreeze(): Boolean = isFreeze
}