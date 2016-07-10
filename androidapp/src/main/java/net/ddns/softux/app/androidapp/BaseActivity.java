package net.ddns.softux.app.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import net.ddns.softux.app.R;

/**
 * Created by juan on 2/07/16.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
