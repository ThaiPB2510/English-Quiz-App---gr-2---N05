package com.example.mad_n2_t16.slide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mad_n2_t16.R;
import com.example.mad_n2_t16.cauhoi.Cauhoi;

import java.util.ArrayList;

public class CheckAnswerAdapter extends BaseAdapter {

    Context context;
    ArrayList listData;
    LayoutInflater inflater;

    public CheckAnswerAdapter(ArrayList listData, Context context) {
        this.listData = listData;
        this.context = context;
        inflater = (LayoutInflater.from(context));

    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int i) {
        return listData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Cauhoi data = (Cauhoi) getItem(i);
        ViewHolder holder;
        if (view == null){
            holder = (ViewHolder) new ViewHolder();
            view = inflater.inflate(R.layout.item_gridview_list_answer,null);
            holder.tvNumAnswer = (TextView) view.findViewById(R.id.tvNumAns);
            holder.tvYourAnswer = (TextView) view.findViewById(R.id.tvAnswer);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }

        int vitri = i + 1;
        holder.tvNumAnswer.setText("Câu " + vitri + ": ");
        holder.tvYourAnswer.setText(data.getAnswer());

        return view;
    }

    private static class ViewHolder{
        TextView tvNumAnswer, tvYourAnswer;

    }
}
