package net.ddns.softux.app.androidapp;

import android.app.Application;

import net.ddns.softux.app.androidapp.di.AndroidAppComponent;
import net.ddns.softux.app.androidapp.di.AndroidAppModule;
import net.ddns.softux.app.androidapp.di.DaggerAndroidAppComponent;


/**
 * Created by juan on 30/06/16.
 */

public class AndroidApp extends Application {
    private AndroidAppComponent androidAppComponent;

    public AndroidAppComponent getAndroidAppComponent() {
        if (androidAppComponent == null) {
            androidAppComponent = DaggerAndroidAppComponent.builder()
                    .androidAppModule(new AndroidAppModule(this))
                    .build();
        }
        return androidAppComponent;
    }

    public void setAppComponent(AndroidAppComponent heyComponent) {
        this.androidAppComponent = heyComponent;
    }
}
