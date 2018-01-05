package com.example.ivan_bakach.dagger2sampleproject.bo;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(includes = BlenderModule.class)
class ColdIceCreamModule {
    @Provides @Singleton Fridge provideFridge() {
        return new SuperFridge();
    }
}