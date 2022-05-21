package com.example.mad_n2_t16;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mad_n2_t16.model_class.DatabaseHelper;
import com.example.mad_n2_t16.model_class.taikhoan;

public class login_activity extends AppCompatActivity {
    EditText etuser;
    EditText etmatkhau;
    Button btndangnhap;
    Button btndangky;
    TextView tvquenmatkhau;
    taikhoan taiKhoan = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        /*ActionBar actionBar = getSupportActionBar();
        actionBar.hide();*/

        init();

        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etuser.getText().toString();
                String MatKhau = etmatkhau.getText().toString();
                if (checkAccount(username, MatKhau)) {
                    Intent intent = new Intent(login_activity.this, Homescreen.class);
                    intent.putExtra("idtaikhoan", taiKhoan.getId());
                    intent.putExtra("tentaikhoan",taiKhoan.getTaiKhoan());
                    intent.putExtra("matkhau", taiKhoan.getMatKhau());
                    startActivity(intent);
                } else {
                    Toast.makeText(login_activity.this, "Đăng nhập không thành công"+
                            "Kiểm tra lại tài khoản hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login_activity.this, register_activity.class);
                startActivity(intent);
            }
        });
    }
    public boolean checkAccount(String username, String MatKhau) {
        // viết câu truy vấn tìm xem trong csdl có thông tin tài khoản và mật khẩu không
        // taiKhoan = getTaiKhoanByUsernameAndPassword()
        DatabaseHelper dbh = new DatabaseHelper(getBaseContext());
        taiKhoan = dbh.getTaiKhoanByUserNameAndPassWord(username, MatKhau);
        if (taiKhoan != null) {
            return true;
        }
        else{
            Toast.makeText(login_activity.this, "Đăng nhập không thành công"+
                    "Tài khoản không tồn tại!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void init() {
        etuser=findViewById(R.id.etusername);
        etmatkhau=findViewById(R.id.etmatkhau);
        btndangnhap=findViewById(R.id.btndangnhap);
        btndangky=findViewById(R.id.btndangky);
    }
}