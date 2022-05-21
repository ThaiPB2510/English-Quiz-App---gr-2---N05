package com.example.mad_n2_t16;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import com.example.mad_n2_t16.slide.ScreenSlideActivity;

public class FragmentActivity extends AppCompatActivity {

    Button de1btn, de2btn;
    String subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        Intent loaiThi = getIntent();
        subject = loaiThi.getStringExtra("subject");
        de1btn = (Button) findViewById(R.id.de1btn);
        de1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FragmentActivity.this, ScreenSlideActivity.class);
                intent.putExtra("num_exam",1);
                intent.putExtra("subject",subject);
                startActivity(intent);
            }
        });
        de2btn = (Button) findViewById(R.id.de2btn);
        de2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FragmentActivity.this, ScreenSlideActivity.class);
                intent.putExtra("num_exam",2);
                intent.putExtra("subject",subject);
                startActivity(intent);
            }
        });
    }
}