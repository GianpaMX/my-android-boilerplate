package net.ddns.softux.app.androidapp.mainusecase;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import net.ddns.softux.app.R;
import net.ddns.softux.app.androidapp.AndroidApp;
import net.ddns.softux.app.androidapp.BaseActivity;
import net.ddns.softux.app.main.MainUseCase;

import javax.inject.Inject;

/**
 * Created by juan on 10/07/16.
 */

public class MainActivity extends BaseActivity {

    @Inject
    public MainUseCase mainUseCase;

    @Inject
    public MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        getMainModule().inject(this);

        setupToolbar();

        MainFragment addEditTaskFragment = getMainFragment();
        if (addEditTaskFragment == null) {
            addEditTaskFragment = newAddEditTaskFragmentInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.main_fragment, addEditTaskFragment).commit();
        }
        mainPresenter.setView(addEditTaskFragment);
    }

    private MainFragment newAddEditTaskFragmentInstance() {
        MainFragment mainFragment;
        mainFragment = MainFragment.newInstance();
        return mainFragment;
    }

    protected MainComponent getMainModule() {
        return ((AndroidApp) getApplication()).getAndroidAppComponent().add(new MainActivityModule(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_edit_task_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        }

        return super.onOptionsItemSelected(item);
    }

    public MainFragment getMainFragment() {
        return (MainFragment) getSupportFragmentManager().findFragmentById(R.id.main_fragment);
    }
}
