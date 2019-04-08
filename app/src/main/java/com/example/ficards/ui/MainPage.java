package com.example.ficards.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.ficards.R;

public class MainPage extends AppCompatActivity {
    private CardView attendance;
    private CardView exams;
    private CardView fees;
    private CardView news;
    private CardView discipline;
    private CardView health;
    private CardView bus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        attendance = findViewById(R.id.attendance);
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,AttendanceActivity.class);
                startActivity(intent);
            }
        });

        exams = findViewById(R.id.exams);
        exams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,ExamsActivity.class);
                startActivity(intent);
            }
        });

        fees = findViewById(R.id.fees);
        fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,FeesActivity.class);
                startActivity(intent);
            }
        });

        news = findViewById(R.id.news);

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,NewsActivity.class);
                startActivity(intent);
            }
        });

        discipline = findViewById(R.id.discipline);
        discipline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,DisciplineActivity.class);
                startActivity(intent);
            }
        });

      health = findViewById(R.id.health);
       health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,HealthActivity.class);
                startActivity(intent);
            }
        });

        bus = findViewById(R.id.bus);
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,BusActivity.class);
                startActivity(intent);
            }
        });
    }
}
