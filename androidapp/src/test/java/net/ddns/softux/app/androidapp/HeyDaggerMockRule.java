package net.ddns.softux.app.androidapp;

import net.ddns.softux.app.androidapp.di.AndroidAppComponent;
import net.ddns.softux.app.androidapp.di.AndroidAppModule;

import it.cosenonjaviste.daggermock.DaggerMockRule;

/**
 * Created by juan on 5/06/16.
 */

public class HeyDaggerMockRule extends DaggerMockRule<AndroidAppComponent> {
    public HeyDaggerMockRule(final AndroidApp androidApp) {
        super(AndroidAppComponent.class, new AndroidAppModule(androidApp));
        set(new ComponentSetter<AndroidAppComponent>() {
            @Override
            public void setComponent(AndroidAppComponent component) {
                androidApp.setAppComponent(component);
            }
        });
    }
}
