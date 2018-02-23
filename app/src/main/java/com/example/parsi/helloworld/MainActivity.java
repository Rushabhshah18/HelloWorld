package com.example.parsi.helloworld;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class MainActivity extends AppCompatActivity {
    private  String msg = "state";
    private View main;


    /**
     *called when activity is first created
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "OnCreate");
        main = findViewById(R.id.main);
        main.setBackgroundColor(Color.WHITE);
        Snackbar snackbar = Snackbar.make(main, "OnCreateInitiated", Snackbar.LENGTH_LONG);
        snackbar.setActionTextColor(Color.WHITE);
        snackbar.show();
    }

    /**
     * Called when activity is about to become visible
     */
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg, "onStart");
        Snackbar snackbar = Snackbar.make(main, "OnStart", Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

    /**
     * called when the activity has become visible
     */
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "onResume");
        Snackbar snackbar = Snackbar.make(main, "OnResume", Snackbar.LENGTH_SHORT);
        snackbar.show();
    }
    /**
     * called when activity does not receive input and cannot execute any code
     * another activity is likely called
     */
    protected void onPause(){
        super.onPause();
        Log.d(msg, "OnPause");
    }

    /**
     * called when activity is not longer visible
     */
    protected void onStop(){
        super.onStop();
        Log.d(msg, "OnStop");
    }

    /**
     * called before the activity is destroyed by the system
     */
    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg, "OnDestroy");
    }

    /**
     * called when the activity restarts after stopping
     */
    protected void onRestart(){
        super.onRestart();
        Log.d(msg, "onRestart");
        Snackbar snackbar = Snackbar.make(main, "OnRestart", Snackbar.LENGTH_SHORT);
        snackbar.setDuration(1).show();
    }



}
