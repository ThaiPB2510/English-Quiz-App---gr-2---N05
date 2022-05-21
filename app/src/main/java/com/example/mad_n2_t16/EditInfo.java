package com.example.mad_n2_t16;

import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mad_n2_t16.model_class.DatabaseHelper;
import com.example.mad_n2_t16.model_class.hocsinh;
import com.example.mad_n2_t16.model_class.taikhoan;


public class EditInfo extends AppCompatActivity {
    EditText username , dob, address, sdt;
    Button btnInfo;
    taikhoan taiKhoan;
    DatabaseHelper db;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_info);

        username = findViewById(R.id.userName);
        dob = findViewById(R.id.dateob);
        address = findViewById(R.id.address);
        sdt = findViewById(R.id.sdt);
        btnInfo = findViewById(R.id.btnInfo);
        Intent intent = getIntent();
        id =  (int) intent.getIntExtra("idtaikhoan",0);
        db = new DatabaseHelper(this);
        taiKhoan = db.getTaiKhoanByID(id);
        fillData(taiKhoan);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    getChangedData();
                    db.updateInfoTaiKhoan(taiKhoan);
                Toast.makeText(EditInfo.this, "Cập nhật thành công", Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void getChangedData() {
        taiKhoan.setTaiKhoan(username.getText().toString());
        taiKhoan.setNgaySinh(dob.getText().toString());
        taiKhoan.setSdt(sdt.getText().toString());
        taiKhoan.setAddress(address.getText().toString());

    }

    private void fillData(taikhoan taiKhoan) {
        username.setText(taiKhoan.getTaiKhoan());
        dob.setText(taiKhoan.getNgaySinh());
        address.setText(taiKhoan.getAddress());
        sdt.setText(taiKhoan.getSdt());
    }



}
