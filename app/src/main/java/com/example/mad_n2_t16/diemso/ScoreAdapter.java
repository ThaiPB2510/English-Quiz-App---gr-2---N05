package com.example.mad_n2_t16.diemso;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.mad_n2_t16.R;

public class ScoreAdapter extends CursorAdapter {
    public ScoreAdapter(Context context, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_score, viewGroup, false);
        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView tvShowScore = (TextView) view.findViewById(R.id.tvShowScore);
        TextView tvNameStudent = (TextView) view.findViewById(R.id.tvNameStudent);
        TextView tvThoiGianLuu = (TextView) view.findViewById(R.id.tvThoiGianLuu);
        TextView tvShowLoaiDe = (TextView) view.findViewById(R.id.tvShowLoaiDe);

        tvNameStudent.setText(cursor.getString(2));
        tvShowScore.setText(Math.round(cursor.getDouble(3)*100.0)/100.0 + "");
        tvThoiGianLuu.setText(cursor.getString(4));
        tvShowLoaiDe.setText(cursor.getString(5));
    }
}
