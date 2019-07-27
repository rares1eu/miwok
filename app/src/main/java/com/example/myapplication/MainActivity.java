package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity", "onCreate");

        TextView numbers = findViewById(R.id.numbers);
        numbers.setOnClickListener(this);

        TextView family = findViewById(R.id.family);
        family.setOnClickListener(this);

        TextView colors = findViewById(R.id.colors);
        colors.setOnClickListener(this);

        TextView phrases = findViewById(R.id.phrases);
        phrases.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.numbers) {
            goToNextActivity(NumbersActivity.class, "Open the list of Numbers.");
        } else if (view.getId() == R.id.family) {
            goToNextActivity(FamilyActivity.class, "Open the list of Family.");
        } else if (view.getId() == R.id.colors) {
            goToNextActivity(ColorsActivity.class, "Open the list of Color.");
        } else if (view.getId() == R.id.phrases) {
            goToNextActivity(PhrasesActivity.class, "Open the list of Phrases.");
        }
    }

    void goToNextActivity(Class activity, String message) {
        Intent numbersIntent = new Intent(MainActivity.this, activity);
        startActivity(numbersIntent);
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity", "onDestroy");
    }



}
