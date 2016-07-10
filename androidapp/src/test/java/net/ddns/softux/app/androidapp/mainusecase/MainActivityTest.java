package net.ddns.softux.app.androidapp.mainusecase;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

import net.ddns.softux.app.BuildConfig;
import net.ddns.softux.app.androidapp.AndroidApp;
import net.ddns.softux.app.androidapp.HeyDaggerMockRule;
import net.ddns.softux.app.main.MainUseCase;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.fakes.RoboMenuItem;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertTrue;

/**
 * Created by juan on 30/06/16.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP_MR1)
public class MainActivityTest {
    @Rule
    public HeyDaggerMockRule mockRule = new HeyDaggerMockRule((AndroidApp) RuntimeEnvironment.application);

    @Mock
    public MainUseCase mainUseCase;

    @Mock
    public MainPresenter mainPresenter;

    @Test
    public void unknownOptionItemSelected() {
        MainActivity addEditTaskActivity = Robolectric.setupActivity(MainActivity.class);
        addEditTaskActivity.onOptionsItemSelected(new RoboMenuItem(0));
    }

    @Test
    public void recreateActivity() {
        Activity activity;
        ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class);

        activity = controller.create().start().postCreate(null).resume().visible().get();
        assertTrue("Activity should be instanciated", activity instanceof MainActivity);

        Bundle bundle = new Bundle();

        // Destroy the original activity
        controller
                .saveInstanceState(bundle)
                .pause()
                .stop()
                .destroy();

        // Bring up a new activity
        controller = Robolectric.buildActivity(MainActivity.class)
                .create(bundle)
                .start()
                .restoreInstanceState(bundle)
                .resume()
                .visible();

        activity = controller.get();
        assertTrue("Activity should be instanciated", activity instanceof MainActivity);
    }
}
