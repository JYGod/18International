package com.yb7001.web.myproject.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.bean.JiesuanBets;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class JiesuanAdapter extends BaseAdapter {
    Context mContext;
    List<JiesuanBets.Result.Rows> data;
    private View view;
    private ViewHolder holder;

    public JiesuanAdapter(Context mContext, List<JiesuanBets.Result.Rows> mList) {
        super();
        this.mContext = mContext;
        this.data = mList;
    }

    public void bindData(List<JiesuanBets.Result.Rows> list) {
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
            view = LayoutInflater.from(mContext).inflate(R.layout.activity_today_yijie, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        if (data!=null){
            JiesuanBets.Result.Rows row=data.get(position);
            holder.tvOrderId.setText(row.getOrderId());
            holder.tvDateTime.setText(row.getDateTime());
            holder.tvLotteryName.setText(row.getLotteryName());
            holder.tvExpectNumber.setText("第"+row.getExpectNumber()+"期");
            holder.tvLotteryPan.setText("盘口（"+row.getLotteryPan()+"）");
            holder.tvBetRecord.setText(row.getBetRecordBZ());
            holder.betPeilv.setText("@"+row.getBetPeilv());
            holder.tvBetMoney.setText(row.getBetMoney());
            holder.tvAccount.setText(row.getAccount());
        }
        return view;
    }

    static class ViewHolder {
        @Bind(R.id.tv_order_id)
        TextView tvOrderId;
        @Bind(R.id.tv_date_time)
        TextView tvDateTime;
        @Bind(R.id.tv_lottery_name)
        TextView tvLotteryName;
        @Bind(R.id.tv_expect_number)
        TextView tvExpectNumber;
        @Bind(R.id.tv_lottery_pan)
        TextView tvLotteryPan;
        @Bind(R.id.tv_bet_record)
        TextView tvBetRecord;
        @Bind(R.id.bet_peilv)
        TextView betPeilv;
        @Bind(R.id.tv_bet_money)
        TextView tvBetMoney;
        @Bind(R.id.tv_account)
        TextView tvAccount;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
