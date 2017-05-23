package com.yb7001.web.myproject.adapter;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.bean.LoadLotteryHistory;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GuangdongKuaileShifenAdapter extends BaseAdapter {
    private Context mContex;
    private ArrayList<List<LoadLotteryHistory.Rows>> data;
    private View view;
    private ViewHolder holder;
    private List<LoadLotteryHistory.Rows> loadLotteryHistory;
    private LoadLotteryHistory.Rows result;
    private Drawable pic1, pic2, pic3;
    private Drawable[] pics;
    private ImageView[] imageViews;
    private String[] resultSting;
    private int[] resultInt;
    private TextView[] tvNum;
    private String[] resultLonghu;
    private TextView[] tvLonghu;

    public GuangdongKuaileShifenAdapter(Context context, ArrayList<List<LoadLotteryHistory.Rows>> data) {
        super();
        this.mContex = context;
        this.data = data;
    }

    public void bindData(ArrayList<List<LoadLotteryHistory.Rows>> list) {
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
            view = LayoutInflater.from(mContex).inflate(R.layout.activity_result_guangdongkuaileshifen, null);
            holder = new GuangdongKuaileShifenAdapter.ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (GuangdongKuaileShifenAdapter.ViewHolder) view.getTag();
        }
        if (data!=null){
            loadLotteryHistory = data.get(position);
            result = loadLotteryHistory.get(position);
            holder.openExpectNumber.setText(result.getOpenExpectNumber());
            holder.openTime.setText(result.getOpenTime());
            tvNum=new TextView[]{holder.openNo1,holder.openNo2,holder.openNo3,holder.openNo4,holder.openNo5,holder.openNo6
            ,holder.openNo7,holder.openNo8};
            resultSting=new String[]{result.getOpenNo1(),result.getOpenNo2(),result.getOpenNo3(),result.getOpenNo4(),
                    result.getOpenNo5(),result.getOpenNo6(),result.getOpenNo7(),result.getOpenNo8()};
            for (int i=0;i<8;i++){
                if (resultSting[i].equals("19")||resultSting[i].equals("20")){
                    tvNum[i].setBackground(view.getResources().getDrawable(R.drawable.circle_red));
                }else {
                    tvNum[i].setBackground(view.getResources().getDrawable(R.drawable.circle_blue));
                }
                tvNum[i].setText(resultSting[i]);
            }
            holder.openTotal.setText(result.getOpenTotal());
            if (result.getOpenTotalDaXiao().equals("大")){
                holder.openTotalDaXiao.setTextColor(view.getResources().getColor(R.color.red));
            }else {
                holder.openTotalDaXiao.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.openTotalDaXiao.setText(result.getOpenTotalDaXiao());
            if (result.getOpenTotalDanShuang().equals("双")){
                holder.openTotalDanShuang.setTextColor(view.getResources().getColor(R.color.red));
            }else {
                holder.openTotalDanShuang.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.openTotalDanShuang.setText(result.getOpenTotalDanShuang());
            if (result.getOpenTotalWeiDaXiao().equals("大")){
                holder.openTotalWeiDaXiao.setTextColor(view.getResources().getColor(R.color.red));
            }else {
                holder.openTotalWeiDaXiao.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.openTotalWeiDaXiao.setText(result.getOpenTotalWeiDaXiao());
            tvLonghu=new TextView[]{holder.longhu1,holder.longhu2,holder.longhu3,holder.longhu4};
            resultLonghu=new String[]{result.getLonghu1(),result.getLonghu2(),result.getLonghu3(),result.getLonghu4()};
            for (int i=0;i<4;i++){
                if (resultLonghu[i].equals("龙")){
                    tvLonghu[i].setTextColor(view.getResources().getColor(R.color.red));
                }else {
                    tvLonghu[i].setTextColor(view.getResources().getColor(R.color.grey));
                }
                tvLonghu[i].setText(resultLonghu[i]);
            }
        }
        return view;
    }

    static class ViewHolder {
        @Bind(R.id.open_expect_number)
        TextView openExpectNumber;
        @Bind(R.id.open_time)
        TextView openTime;
        @Bind(R.id.open_no1)
        TextView openNo1;
        @Bind(R.id.open_no2)
        TextView openNo2;
        @Bind(R.id.open_no3)
        TextView openNo3;
        @Bind(R.id.open_no4)
        TextView openNo4;
        @Bind(R.id.open_no5)
        TextView openNo5;
        @Bind(R.id.open_no6)
        TextView openNo6;
        @Bind(R.id.open_no7)
        TextView openNo7;
        @Bind(R.id.open_no8)
        TextView openNo8;
        @Bind(R.id.open_total)
        TextView openTotal;
        @Bind(R.id.open_total_da_xiao)
        TextView openTotalDaXiao;
        @Bind(R.id.open_total_dan_shuang)
        TextView openTotalDanShuang;
        @Bind(R.id.open_total_wei_da_xiao)
        TextView openTotalWeiDaXiao;
        @Bind(R.id.longhu1)
        TextView longhu1;
        @Bind(R.id.longhu2)
        TextView longhu2;
        @Bind(R.id.longhu3)
        TextView longhu3;
        @Bind(R.id.longhu4)
        TextView longhu4;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
