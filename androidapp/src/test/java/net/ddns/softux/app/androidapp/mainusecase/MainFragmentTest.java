package net.ddns.softux.app.androidapp.mainusecase;

import android.os.Build;

import net.ddns.softux.app.BuildConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by juan on 2/07/16.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP_MR1)
public class MainFragmentTest {
    @Test
    public void dummy() {
    }
}