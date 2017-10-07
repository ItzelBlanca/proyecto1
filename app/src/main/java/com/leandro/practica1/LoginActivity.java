package com.leandro.practica1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class LoginActivity extends BaseActivity {

    private static final String TAG = LoginActivity.class.getName();

    private Toolbar toolbar;

    @Override
    protected int getLayoutResID() {

        return R.layout.activity_login;
    }


    private void initConfigToolbar(){
        toolbar = getToolbar();
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));
    }

    @Override
    protected void initView() {
        super.initView();
        initConfigToolbar();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "ONCREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "OnDestroy");
    }
}
