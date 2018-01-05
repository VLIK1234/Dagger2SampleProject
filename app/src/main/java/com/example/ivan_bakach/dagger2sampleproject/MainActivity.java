package com.example.ivan_bakach.dagger2sampleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((CustomApplication)getApplicationContext())
                .getIceCreamShop()
                .maker()
                .make();
    }
}
