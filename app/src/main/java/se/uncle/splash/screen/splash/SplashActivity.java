package se.uncle.splash.screen.splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import se.uncle.splash.R;
import se.uncle.splash.screen.dashboard.DashboardActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DashboardActivity.start(this);
        finish();
    }
}
