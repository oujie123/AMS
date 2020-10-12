package com.gacrnd.gcs.ams;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "JackOu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickUnregisterActivity(View view) {
        Intent intent = new Intent(this,TargetActivity.class);
        startActivity(intent);
    }

    public void hookActivity(View view) {
        Log.i(TAG, "hookActivity: " + Build.VERSION.SDK_INT);
        HookHelper.hookAMSAidl();
        HookHelper.hookHandler();
        Intent intent = new Intent(this,TargetActivity.class);
        startActivity(intent);
    }
}
