package ru.sheps.android.homework611;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle", "onCreate");
        TextView textView = findViewById(R.id.textView);
        textView.append("\n" + "ОnClick");

    }

    
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: " + this);
        TextView textView = findViewById(R.id.textView);
        textView.append("\n" + "ОnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: " + this);
        TextView textView = findViewById(R.id.textView);
        textView.append("\n" + "ОnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: " + this);
        TextView textView = findViewById(R.id.textView);
        textView.append("\n" + "ОnPaused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: " + this);
        TextView textView = findViewById(R.id.textView);
        textView.append("\n" + "ОnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + this);
        TextView textView = findViewById(R.id.textView);
        textView.append("\n" + "ОnDestroy");
    }

}
