package com.yb7001.web.myproject.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.bean.BetSuccess;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BetResAdapter extends BaseAdapter {
    private Context mContex;
    private ArrayList<BetSuccess> data;
    private View view;
    private ViewHolder holder;

    public BetResAdapter(Context mContext, ArrayList<BetSuccess> data) {
        super();
        this.mContex = mContext;
        this.data = data;
    }

    public void bindData(ArrayList<BetSuccess> list) {
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
            view = LayoutInflater.from(mContex).inflate(R.layout.bet_result_item, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else {
            holder=(ViewHolder)view.getTag();
        }
        if (data!=null){
            BetSuccess bet=data.get(position);
            holder.betId.setText(bet.getBetId());
            holder.betDrawnum.setText(bet.getBetNum());
            holder.betGame.setText(bet.getBetGame());
            holder.betOdd.setText(bet.getBetOdd());
            holder.betMoney.setText(bet.getBetMoney());

        }
        return view;
    }

    static class ViewHolder {
        @Bind(R.id.bet_id)
        TextView betId;
        @Bind(R.id.bet_drawnum)
        TextView betDrawnum;
        @Bind(R.id.bet_game)
        TextView betGame;
        @Bind(R.id.bet_odd)
        TextView betOdd;
        @Bind(R.id.bet_money)
        TextView betMoney;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
