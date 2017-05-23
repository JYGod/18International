package com.yb7001.web.myproject.adapter;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yb7001.web.myproject.MainGlobalData;
import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.bean.BetResult;
import com.yb7001.web.myproject.bean.JiesuanBets;
import com.yb7001.web.myproject.service.SoapServiceImpl;
import com.yb7001.web.myproject.tools.CustomDialog;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class WeijieAdapter extends BaseAdapter {
    Context mContext;
    List<JiesuanBets.Result.Rows> data;
    private View view;
    private ViewHolder holder;
    private String res;

    public WeijieAdapter(Context mContext, List<JiesuanBets.Result.Rows> mList) {
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
            view = LayoutInflater.from(mContext).inflate(R.layout.activity_weijie, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        if (data != null) {
            JiesuanBets.Result.Rows row = data.get(position);
            holder.tvOrderId.setText(row.getOrderId());
            holder.tvDateTime.setText(row.getDateTime());
            holder.tvLotteryName.setText(row.getLotteryName());
            holder.tvExpectNumber.setText("第" + row.getExpectNumber() + "期");
            holder.tvLotteryPan.setText("盘口（" + row.getLotteryPan() + "）");
            holder.tvBetRecord.setText(row.getBetRecordBZ());
            holder.betPeilv.setText("@" + row.getBetPeilv());
            holder.tvBetMoney.setText(row.getBetMoney());
            holder.tvAccount.setText(row.getAccount());
            holder.tvLotteryId.setText(row.getLotteryId());
            holder.tvCancel.setTag(position);
            holder.tvCancel.setOnClickListener((View v)->{
                CustomDialog.Builder builder = new CustomDialog.Builder(mContext);
                builder.setMessage("确定要撤单吗?");
                builder.setPositiveButton("确定",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        new Thread(){
                            public void run(){
                                res=new SoapServiceImpl().cancelOrderService(row.getLotteryId(),row.getOrderId(),
                                        MainGlobalData.TOKEN);
                                mHandler.sendEmptyMessage(1);
                            }
                        }.start();
                    }
                });
                builder.setNegativeButton("取消",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                builder.create().show();
            });
        }
        return view;
    }

    Handler mHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==1){
                if (!res.equals("请求数据失败！")){
                    Log.e("res",res);
                    Gson gson=new Gson();
                    BetResult resTip = gson.fromJson(res, BetResult.class);
                    Toast.makeText(mContext,resTip.getTip(),Toast.LENGTH_SHORT).show();
                    holder.tvCancel.setText("已撤单");
                    holder.tvCancel.setTextColor(mContext.getResources().getColor(R.color.grey));
                    holder.tvCancel.setClickable(false);
                }else {
                    Toast.makeText(mContext,"撤单失败",Toast.LENGTH_SHORT).show();
                }
            }
        }
    };


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
        @Bind(R.id.tv_cancel)
        TextView tvCancel;
        @Bind(R.id.tv_lottery_id)
        TextView tvLotteryId;


        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
