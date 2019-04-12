package com.example.ficards.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.ficards.R;

public class ExamsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exams);

        Spinner checkResults =(Spinner) findViewById(R.id.checkResultSpinner);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.results, R.layout.spinner_item_selected);

        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);

        checkResults.setAdapter(adapter);
    }
}
