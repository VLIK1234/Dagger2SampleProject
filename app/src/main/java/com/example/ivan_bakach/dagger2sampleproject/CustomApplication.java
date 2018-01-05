package com.example.ivan_bakach.dagger2sampleproject;

import android.app.Application;

import com.example.ivan_bakach.dagger2sampleproject.bo.DaggerIceCreamShop;
import com.example.ivan_bakach.dagger2sampleproject.bo.IceCreamShop;

public class CustomApplication extends Application {

    private IceCreamShop iceCreamShop;

    @Override
    public void onCreate() {
        super.onCreate();
        iceCreamShop = DaggerIceCreamShop.builder().build();
    }

    public IceCreamShop getIceCreamShop() {
        return iceCreamShop;
    }
}
