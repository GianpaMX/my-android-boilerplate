package net.ddns.softux.app.androidapp.di;

import android.content.Context;

import net.ddns.softux.app.main.MainInteractor;
import net.ddns.softux.app.main.MainUseCase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by juan on 30/06/16.
 */

@Module
public class AndroidAppModule {
    protected Context context;

    public AndroidAppModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainUseCase provideMainUseCase() {
        return new MainInteractor();
    }
}
