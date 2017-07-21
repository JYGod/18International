package com.yb7001.web.myproject.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.bean.JiesuanBets;
import com.yb7001.web.myproject.bean.LoadUserBets;

import java.util.ArrayList;
import java.util.List;

public class BaobiaoAdapter extends BaseAdapter {

    private Context mContex;
    private List<LoadUserBets.Rows> data;
    private View view;
    private ViewHolder holder;

    public BaobiaoAdapter(Context mContex, List<LoadUserBets.Rows> rowses) {
        this.mContex = mContex;
        this.data = rowses;
    }

    public void bindData(List<LoadUserBets.Rows> list) {
        this.data = list;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        view = convertView;
        if (view == null) {
            view = LayoutInflater.from(mContex).inflate(R.layout.activity_baobiao, null);
            holder = new ViewHolder();
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        if (data != null) {
            LoadUserBets.Rows rows = data.get(position);
            holder.tvDate = (TextView) view.findViewById(R.id.tv_date);
            holder.tvCount = (TextView) view.findViewById(R.id.tv_count);
            holder.tvBetMoney = (TextView) view.findViewById(R.id.tv_bet_money);
            holder.tvBetAcount = (TextView) view.findViewById(R.id.tv_bet_acount);
            holder.tvDate.setText(rows.getDateTime());
            holder.tvBetMoney.setText(rows.getBetMoney());
            holder.tvBetAcount.setText(rows.getBetAcount());
        }
        return view;
    }


    class ViewHolder {

        TextView tvDate, tvCount, tvBetMoney, tvBetAcount;
    }
}
