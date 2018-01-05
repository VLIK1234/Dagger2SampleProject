package com.example.ivan_bakach.dagger2sampleproject.bo;

import dagger.Module;
import dagger.Provides;

@Module
class BlenderModule {
    @Provides
    Blender provideBlender() {
        return new SuperBlender();
    }

}
