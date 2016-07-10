package net.ddns.softux.app.androidapp.di;

import net.ddns.softux.app.androidapp.mainusecase.MainActivityModule;
import net.ddns.softux.app.androidapp.mainusecase.MainComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by juan on 30/06/16.
 */

@Component(modules = {AndroidAppModule.class})
@Singleton
public interface AndroidAppComponent {
    MainComponent add(MainActivityModule mainActivityModule);
}
