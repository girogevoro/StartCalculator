package com.girogevoro.startcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.start).setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("calculator://start"));
            intent.putExtra(DATA, getString(R.string.start_calculator));

            Intent choice_calculator = Intent.createChooser(intent, getString(R.string.choice_calculator));

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(choice_calculator);
            }

        });
    }
}