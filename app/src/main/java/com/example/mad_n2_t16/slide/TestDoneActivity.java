package com.example.mad_n2_t16.slide;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.mad_n2_t16.R;
import com.example.mad_n2_t16.cauhoi.Cauhoi;
import com.example.mad_n2_t16.diemso.ScoreController;

import java.util.ArrayList;

public class TestDoneActivity extends AppCompatActivity {

    ArrayList<Cauhoi> arrayQuesBegin = new ArrayList<Cauhoi>();
    int numNotAns = 0;
    int numTrue = 0;
    int numFalse = 0;
    double totalPoint = 0;

    ScoreController scoreController;

    TextView tvTrue, tvFalse, tvNotAns, tvTotalPoint;
    Button redobtn, exitbtn, savebtn;
    String subject;
    int num_exam;
    String showLoaiDe = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_done);

        scoreController = new ScoreController(TestDoneActivity.this);

        Intent intent = getIntent();
        arrayQuesBegin = (ArrayList<Cauhoi>) intent.getExtras().getSerializable("arr_ques");
        subject = (String) intent.getStringExtra("subject");
        num_exam = (Integer) intent.getIntExtra("num_exam",0);

        begin();
        checkKQ();
        tvNotAns.setText(""+numNotAns);
        tvTrue.setText(""+numTrue);
        tvFalse.setText(""+numFalse);
        totalPoint = ((double) numTrue/21)*10;

        tvTotalPoint.setText(""+Math.round(totalPoint*100.0)/100.0);

        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TestDoneActivity.this);
                builder.setIcon(R.drawable.exit);
                builder.setTitle("Thông báo");
                builder.setMessage("Bạn có muốn thoát?");
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.show();
            }
        });
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLoaiDe = getStringShowLoaiDe(subject,num_exam);
                AlertDialog.Builder builder = new AlertDialog.Builder(TestDoneActivity.this);
                LayoutInflater inflater = TestDoneActivity.this.getLayoutInflater();
                View view1 = inflater.inflate(R.layout.alert_dialog_save_score, null);
                builder.setView(view1);

                EditText edtHoTen = (EditText) view1.findViewById(R.id.edtHoten);
                TextView tvDiemLuu = (TextView) view1.findViewById(R.id.tvDiemLuu);
                double numTotalScore = ((double)numTrue/21)*10;
                Toast.makeText(TestDoneActivity.this, ""+numTotalScore, Toast.LENGTH_SHORT).show();
                tvDiemLuu.setText(Math.round(numTotalScore*100.0)/100.0 + "");
                builder.setTitle("Lưu điểm thi");
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String name = edtHoTen.getText().toString();
                        scoreController.insertScore(name, numTotalScore, showLoaiDe);
                        Toast.makeText(TestDoneActivity.this, "Lưu điểm thành công!", Toast.LENGTH_LONG).show();
                        finish();
                        dialogInterface.dismiss();
                    }
                });
                builder.setNegativeButton("Không ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog b = builder.create();
                b.show();
            }
        });
    }

    public void begin(){
        tvTrue = (TextView) findViewById(R.id.tvTrue);
        tvNotAns = (TextView) findViewById(R.id.tvNotAns);
        tvFalse = (TextView) findViewById(R.id.tvFalse);
        tvTotalPoint = (TextView) findViewById(R.id.tvTotalPoint);
        exitbtn = (Button) findViewById(R.id.exitbtn);
        savebtn = (Button) findViewById(R.id.savebtn);
    }

    public void checkKQ(){
        for (int i = 0; i < arrayQuesBegin.size(); i++){
            if (arrayQuesBegin.get(i).getAnswer().equals("") == true) numNotAns++;
            else if (arrayQuesBegin.get(i).getResult().equals(arrayQuesBegin.get(i).getAnswer()) == true) numTrue++;
            else numFalse++;
        }
    }

    public String getStringShowLoaiDe(String sub, int nume){
        if(sub.equals("coban")){
            String ra = "Cơ Bản - Đề " + nume;
            Toast.makeText(TestDoneActivity.this, "" + ra, Toast.LENGTH_SHORT).show();
            return ra;
        }
        else if (sub.equals("trungcap")){
            String ra = "Trung Cấp - Đề " + nume;
            Toast.makeText(TestDoneActivity.this, "" + ra, Toast.LENGTH_SHORT).show();
            return ra;
        }
        else if (sub.equals("nangcao")){
            String ra = "Nâng Cao - Đề " + nume;
            Toast.makeText(TestDoneActivity.this, "" + ra, Toast.LENGTH_SHORT).show();
            return ra;
        }
        return "none";
    }
}