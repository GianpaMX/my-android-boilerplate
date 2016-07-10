package net.ddns.softux.app.androidapp.mainusecase;

import net.ddns.softux.app.androidapp.di.ActivityScope;

import dagger.Subcomponent;

/**
 * Created by juan on 30/06/16.
 */

@ActivityScope
@Subcomponent(modules = {MainActivityModule.class})
public interface MainComponent {
    void inject(MainActivity MainActivity);
}
