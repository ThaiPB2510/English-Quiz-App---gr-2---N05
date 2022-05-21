package com.example.mad_n2_t16;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mad_n2_t16.diemso.ScoreActivity;
import com.example.mad_n2_t16.model_class.DatabaseHelper;
import com.example.mad_n2_t16.model_class.hocsinh;
import com.example.mad_n2_t16.model_class.taikhoan;


public class Homescreen extends AppCompatActivity {
    TextView editInfo, editPass, showName;
    LinearLayout viewHistory, viewLythuyet, viewLuyenThi;
    Button btnLogout;
    DatabaseHelper dbh = new DatabaseHelper(getBaseContext());
    String userName, matKhau;
    int id;
    taikhoan taiKhoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        btnLogout = (Button) findViewById(R.id.btnLogOut);
        editPass = (TextView) findViewById(R.id.btneditPassword);
        editInfo = (TextView) findViewById(R.id.btneditUser);
        viewHistory = (LinearLayout) findViewById(R.id.btnlichsu);
        viewLythuyet = (LinearLayout)findViewById(R.id.btnLyThuyet);
        viewLuyenThi = (LinearLayout)findViewById(R.id.viewLuyenThi);
        showName = findViewById(R.id.showName);
        Intent intent = getIntent();
        userName = (String) intent.getStringExtra("tentaikhoan");
        matKhau = (String) intent.getStringExtra("matkhau");
        id = (int) intent.getIntExtra("idtaikhoan",0);
        showName.setText(userName);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homescreen.this, login_activity.class);
                startActivity(intent);
                Toast.makeText(Homescreen.this, "Bạn đã đăng xuất", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        viewLythuyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLythuyet();
            }
        });

        editPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEditPass();
            }
        });
        editInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEditInfo();
            }
        });
        viewHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHistory();
            }
        });
        viewLuyenThi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLuyenThi();
            }
        });
    }

    public void openLuyenThi() {
        Intent exam = new Intent(Homescreen.this, LuyenThiActivity.class);
        startActivity(exam);
    }

    public void openEditPass(){
        Intent password = new Intent(Homescreen.this, UpdatePassword.class);
        password.putExtra("idtaikhoan", id);
        password.putExtra("matkhau", matKhau);
        startActivity(password);
    }
    public void openHistory(){
        Intent intent = new Intent(Homescreen.this, ScoreActivity.class);
        startActivity(intent);
    }

    public void openEditInfo(){
        Intent intent = new Intent(Homescreen.this, EditInfo.class);
        intent.putExtra("idtaikhoan", id);
        startActivity(intent);
    }

    public void openLythuyet(){
        Intent lythuyet = new Intent(Homescreen.this, LyThuyet.class);
        startActivity(lythuyet);
    }
}