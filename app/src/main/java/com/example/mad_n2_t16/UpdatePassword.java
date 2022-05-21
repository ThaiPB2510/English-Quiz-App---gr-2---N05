package com.example.mad_n2_t16;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mad_n2_t16.model_class.DatabaseHelper;
import com.example.mad_n2_t16.model_class.taikhoan;


public class UpdatePassword extends AppCompatActivity {
    EditText oldPass, newPass, newPassAgain;
    Button btnPass;
    DatabaseHelper dbh;
    String matKhau;
    int id;
    taikhoan taiKhoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_password);

        oldPass = findViewById(R.id.oldPass);
        newPass = findViewById(R.id.newPass);
        newPassAgain = findViewById(R.id.newPassAgain);
        btnPass = findViewById(R.id.btnSaveUpPass);

        Intent intent = getIntent();
        id = intent.getIntExtra("idtaikhoan",0);

        matKhau = intent.getStringExtra("matkhau");
        dbh = new DatabaseHelper(this);
        taiKhoan = dbh.getTaiKhoanByID(id);
        //matKhau = taiKhoan.getMatKhau();
        btnPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String validateMes = new String(checkValidRegisterInput(oldPass, newPass, newPassAgain));

                if(validateMes.equals("")){
                    taiKhoan.setMatKhau(newPass.getText().toString());
                    dbh.updatePassword(taiKhoan);
                    Toast.makeText(UpdatePassword.this, "Cập nhật mật khẩu thành công", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(UpdatePassword.this, validateMes, Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    private String checkValidRegisterInput(EditText oldPass, EditText newPass, EditText newPassAgain) {
        // trong method nay kiem tr xau rong
        String result = "";
        String txtOldPass = oldPass.getText().toString();
        String txtPassword = newPass.getText().toString();
        String txtPasswordagain = newPassAgain.getText().toString();

        if(txtOldPass.equals("")||txtPassword.equals("")||txtPasswordagain.equals("")){
            result = "Cần nhập đủ tất cả các trường";
        }else if (!txtPassword.equals(txtPasswordagain)){
            result = "Mật khẩu nhập lại không đúng";
        }else if (txtOldPass.split(" ").length > 1 ||
                txtPassword.split(" ").length > 1 ||
                txtPasswordagain.split(" ").length > 1){
            result = "Không nhập khoảng trắng";
        }else if(txtPassword.length() < 8) {
            result = "Mật khẩu cần dài ít nhất 8 ký tự";
        }else if(!txtOldPass.equals(matKhau)){
            result = "Mật khẩu cũ chưa đúng";
        }
        return result;
    }
}
