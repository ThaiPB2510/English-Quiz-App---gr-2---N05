package com.example.mad_n2_t16;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class LyThuyet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        actionBar.setCustomView(R.layout.toolbar_title_layout);
        actionBar.setDisplayHomeAsUpEnabled(true);*/

        setContentView(R.layout.activity_lythuyet);

        Button basicTheory = (Button) findViewById(R.id.basic);
        basicTheory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent basic = new Intent(LyThuyet.this, Theory.class);
                basic.putExtra("extra", 1);
                startActivity(basic);
            }
        });

        Button intermediateTheory = (Button) findViewById(R.id.intermediate);
        intermediateTheory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intermediate = new Intent(LyThuyet.this, Theory.class);
                intermediate.putExtra("extra", 2);
                startActivity(intermediate);
            }
        });

        Button advanceTheory = (Button) findViewById(R.id.advance);
        advanceTheory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent advance = new Intent(LyThuyet.this, Theory.class);
                advance.putExtra("extra", 3);
                startActivity(advance);
            }
        });
    }
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                this.finish();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}