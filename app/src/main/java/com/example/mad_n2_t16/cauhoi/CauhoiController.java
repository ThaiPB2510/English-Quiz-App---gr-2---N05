package com.example.mad_n2_t16.cauhoi;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class CauhoiController {
    private DBHelper dbHelper;

    public CauhoiController(Context context) {
        dbHelper = new DBHelper(context);
    }

    public ArrayList<Cauhoi> getCauhoi(int num_exam, String subject){
        ArrayList<Cauhoi> lsData = new ArrayList<Cauhoi>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM engtest WHERE num_exam=? AND subject=?";
        String[] selection = {""+num_exam,subject};
        Cursor cursor = db.rawQuery(query,selection);
        cursor.moveToFirst();
        do {
            Cauhoi item;
            item = new Cauhoi(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getInt(8),"");
            lsData.add(item);
        }while (cursor.moveToNext());
        return lsData;
    }
}
