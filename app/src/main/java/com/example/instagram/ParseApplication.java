package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GP6n0uhX7qIw2vGVbqAWA26FepxjGxBiZAvMKP8F")
                .clientKey("51egfDMLDuFw3CPrCT2g2z4BiebvO2hL8IjdWMUq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
