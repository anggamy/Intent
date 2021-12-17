package com.example.intentparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_AGE = "extra_age";
    private TextView tvDataResived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);
        tvDataResived = (TextView) findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 17);
        String text = "Name " + name + ", Your Age:" + age;
        tvDataResived.setText(text);
    }
}