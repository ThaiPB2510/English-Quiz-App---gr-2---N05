package com.example.mad_n2_t16.diemso;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.mad_n2_t16.cauhoi.DBHelper;

public class ScoreController {
    private DBHelper dbHelper;

    public ScoreController(Context context) {
        dbHelper = new DBHelper(context);
    }

    public void insertScore(String name, double score, String room){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("score", score);
        values.put("room", room);
        db.insert("tbscore", null, values);
        db.close();
    }

    public Cursor getScore(){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query("tbscore",null,null,null,null,null,"id DESC",null);
        if (cursor != null){
            cursor.moveToFirst();
        }
        return cursor;
    }
}
