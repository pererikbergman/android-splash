package se.uncle.splash.screen.splash;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import se.uncle.splash.R;
import se.uncle.splash.screen.dashboard.DashboardActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DELAY = 3000;

    private final Handler  mHandler  = new Handler();
    private final Launcher mLauncher = new Launcher();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onStart() {
        super.onStart();

        mHandler.postDelayed(mLauncher, SPLASH_DELAY);
    }

    @Override
    protected void onStop() {
        mHandler.removeCallbacks(mLauncher);

        super.onStop();
    }

    private void launch() {
        if (!isDestroyed()) {
            DashboardActivity.start(SplashActivity.this);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();
        }
    }

    private class Launcher implements Runnable {

        @Override
        public void run() {
            launch();
        }
    }
}
