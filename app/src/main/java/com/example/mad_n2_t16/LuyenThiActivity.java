package com.example.mad_n2_t16;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.mad_n2_t16.cauhoi.DBHelper;
import com.example.mad_n2_t16.diemso.ScoreActivity;

import java.io.IOException;

public class LuyenThiActivity extends AppCompatActivity {

    Button coBanBTN,trungCapBTN,nangCaoBTN, xemlichsuBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luyenthi);

        coBanBTN = (Button) findViewById(R.id.cobanbtn);
        trungCapBTN = findViewById(R.id.trungcapbtn);
        nangCaoBTN = findViewById(R.id.nangcaobtn);


        coBanBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LuyenThiActivity.this, FragmentActivity.class);
                intent.putExtra("subject", "coban");
                startActivity(intent);
            }
        });
        trungCapBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LuyenThiActivity.this, FragmentActivity.class);
                intent.putExtra("subject", "trungcap");
                startActivity(intent);
            }
        });
        nangCaoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LuyenThiActivity.this, FragmentActivity.class);
                intent.putExtra("subject", "nangcao");
                startActivity(intent);
            }
        });
        /*xemlichsuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LuyenThiActivity.this, ScoreActivity.class);
                startActivity(intent);
            }
        });*/

        DBHelper dbHelper = new DBHelper(LuyenThiActivity.this);

        //Xóa data lần chạy trước
        /*try {
            dbHelper.deleteDataBase();
            Toast.makeText(LuyenThiActivity.this, "Xóa thành công", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(LuyenThiActivity.this, "Không xóa được", Toast.LENGTH_SHORT).show();
        }*/

        try {
            dbHelper.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}