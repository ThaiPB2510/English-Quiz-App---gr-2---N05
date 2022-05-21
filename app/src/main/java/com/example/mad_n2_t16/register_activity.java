package com.example.mad_n2_t16;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mad_n2_t16.model_class.DatabaseHelper;
import com.example.mad_n2_t16.model_class.hocsinh;
import com.example.mad_n2_t16.model_class.taikhoan;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import com.example.mad_n2_t16.R;

public class register_activity extends AppCompatActivity {

    EditText ettUsernameregister, etpPasswordregister, etpPasswordregisteragain, etemail;
    Button btndangky, btnquaylaidangky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        /*ActionBar actionBar = getSupportActionBar();
        actionBar.hide();*/

        init();

        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String validateMes = new String(checkValidRegisterInput(ettUsernameregister, etpPasswordregister,etpPasswordregisteragain));
                if(validateMes.equals("")){
                    String addAccountMes = addNewAccount(ettUsernameregister, etemail, etpPasswordregister);

                    if(addAccountMes.equals("")){
                        Toast.makeText(register_activity.this, "Đăng ký tài khoản thành công", Toast.LENGTH_SHORT).show();

                    }else {
                        Toast.makeText(register_activity.this, addAccountMes, Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(register_activity.this, validateMes, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnquaylaidangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register_activity.this, login_activity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private String addNewAccount(EditText ettUsernameregister,EditText etemail, EditText etpPasswordregister) {
        // trong method nay kiem tra ten tai khoan ton tai, them tai khoan
        String result = "";
        String txtUsername = ettUsernameregister.getText().toString();
        String txtPassword = etpPasswordregister.getText().toString();
        String txtEmail = etemail.getText().toString();

        boolean checkTaiKhoan = true;
        DatabaseHelper dbh = new DatabaseHelper(getBaseContext());
        checkTaiKhoan = dbh.checkTaiKhoanByUsername(txtUsername);

        if(checkTaiKhoan == false){
            result += "\nTên tài khoản đã tồn tại";
        }

        if(result.equals("")) {
            hocsinh hs = new hocsinh();
            dbh.addHS(hs);

            taikhoan taiKhoan = new taikhoan();
            taiKhoan.setTaiKhoan(txtUsername);
            taiKhoan.setEmail(txtEmail);
            taiKhoan.setMatKhau(txtPassword);

            dbh.addTaiKhoan(taiKhoan, hs.getIdHS());
        }
        return result;
    }

    private String checkValidRegisterInput(EditText ettUsernameregister, EditText etpPasswordregister, EditText etpPasswordregisteragain) {
        // trong method nay kiem tr xau rong
        String result = "";
        String txtUsername = ettUsernameregister.getText().toString();
        String txtPassword = etpPasswordregister.getText().toString();
        String txtPasswordagain = etpPasswordregisteragain.getText().toString();

        if(txtUsername.equals("")||txtPassword.equals("")||txtPasswordagain.equals("")){
            result = "Cần nhập đủ tất cả các trường";
        }else if (!txtPassword.equals(txtPasswordagain)){
            result = "Mật khẩu nhập lại không đúng";
        }else if (txtUsername.split(" ").length > 1 ||
                txtPassword.split(" ").length > 1 ||
                txtPasswordagain.split(" ").length > 1){
            result = "Không nhập khoảng trắng";
        }else if(txtPassword.length() < 8) {
            result = "Mật khẩu cần dài ít nhất 8 ký tự";
        }
        return result;
    }

    private void init() {
        ettUsernameregister = findViewById(R.id.ettUsernameregister);
        etemail = findViewById(R.id.etemail);
        etpPasswordregister = findViewById(R.id.etpPasswordregister);
        etpPasswordregisteragain = findViewById(R.id.etpPasswordregisteragain);
        btndangky = findViewById(R.id.btndangky);
        btnquaylaidangky = findViewById(R.id.btnquaylaidangky);
    }
}
