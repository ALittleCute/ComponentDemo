package com.i21games.module_news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mzule.activityrouter.annotation.Router;

@Router("authentication")
public class AuthenticationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
