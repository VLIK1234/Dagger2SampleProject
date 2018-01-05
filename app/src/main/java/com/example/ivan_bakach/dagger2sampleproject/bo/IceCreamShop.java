package com.example.ivan_bakach.dagger2sampleproject.bo;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ColdIceCreamModule.class)
public interface IceCreamShop {
    IceCreamMaker maker();
}
