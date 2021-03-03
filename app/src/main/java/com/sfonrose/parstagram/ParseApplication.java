package com.sfonrose.parstagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ySgdpF6DYEbeCUCSmPvuFXcNz8yQGiVxHqBgcpvg")
                .clientKey("tgw38LRK8omxgcjjc8mwDH13qWixixPMOTVh5QZt")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
