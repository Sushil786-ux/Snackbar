package com.example.demoapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click=findViewById(R.id.click);
        View parentLayout = findViewById(android.R.id.content);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(parentLayout,"Welcome to Technical Sushil",Snackbar.LENGTH_LONG)
                        .setActionTextColor(getResources().getColor(android.R.color.holo_red_light)).show();
            }
        });

    }
}