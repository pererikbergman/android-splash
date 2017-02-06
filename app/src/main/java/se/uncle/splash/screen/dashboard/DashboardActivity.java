package se.uncle.splash.screen.dashboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import se.uncle.splash.R;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public static void start(final Context context) {
        context.startActivity(new Intent(context, DashboardActivity.class));
    }
}
