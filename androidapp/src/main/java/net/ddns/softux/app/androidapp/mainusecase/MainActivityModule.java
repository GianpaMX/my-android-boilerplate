package net.ddns.softux.app.androidapp.mainusecase;

import net.ddns.softux.app.androidapp.di.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by juan on 30/06/16.
 */

@Module
public class MainActivityModule {
    private MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    @ActivityScope
    public MainActivity provideMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }
}
