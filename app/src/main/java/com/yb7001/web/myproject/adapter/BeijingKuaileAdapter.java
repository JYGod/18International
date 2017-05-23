package com.yb7001.web.myproject.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.bean.LoadLotteryHistory;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BeijingKuaileAdapter extends BaseAdapter {
    private Context mContex;
    private ArrayList<List<LoadLotteryHistory.Rows>> data;
    private View view;
    private ViewHolder holder;
    private List<LoadLotteryHistory.Rows> loadLotteryHistory;
    private LoadLotteryHistory.Rows result;

    public BeijingKuaileAdapter(Context context, ArrayList<List<LoadLotteryHistory.Rows>> data) {
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
            view = LayoutInflater.from(mContex).inflate(R.layout.activity_result_beijingkuaile, null);
            holder = new BeijingKuaileAdapter.ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (BeijingKuaileAdapter.ViewHolder) view.getTag();
        }

        if (data!=null){
            loadLotteryHistory=data.get(position);
            result=loadLotteryHistory.get(position);
            holder.openExpectNumber.setText(result.getOpenExpectNumber());
            holder.openTime.setText(result.getOpenTime());
            holder.openNo1.setText(result.getOpenNo1());
            holder.openNo2.setText(result.getOpenNo2());
            holder.openNo3.setText(result.getOpenNo3());
            holder.openNo4.setText(result.getOpenNo4());
            holder.openNo5.setText(result.getOpenNo5());
            holder.openNo6.setText(result.getOpenNo6());
            holder.openNo7.setText(result.getOpenNo7());
            holder.openNo8.setText(result.getOpenNo8());
            holder.openNo9.setText(result.getOpenNo9());
            holder.openNo10.setText(result.getOpenNo10());
            holder.openNo11.setText(result.getOpenNo11());
            holder.openNo12.setText(result.getOpenNo12());
            holder.openNo13.setText(result.getOpenNo13());
            holder.openNo14.setText(result.getOpenNo14());
            holder.openNo15.setText(result.getOpenNo15());
            holder.openNo16.setText(result.getOpenNo16());
            holder.openNo17.setText(result.getOpenNo17());
            holder.openNo18.setText(result.getOpenNo18());
            holder.openNo19.setText(result.getOpenNo19());
            holder.openNo20.setText(result.getOpenNo20());
            holder.openTotal.setText(result.getOpenTotal());
            if (result.getOpenTotalDaXiao().equals("大")){
                holder.openTotalDaXiao.setTextColor(Color.RED);
            }else {
                holder.openTotalDaXiao.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.openTotalDaXiao.setText(result.getOpenTotalDaXiao());
            if (result.getOpenTotalDanShuang().equals("双")){
                holder.openTotalDanShuang.setTextColor(Color.RED);
            }else {
                holder.openTotalDanShuang.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.openTotalDanShuang.setText(result.getOpenTotalDanShuang());
            holder.wuxing.setText(result.getWuxing());

            if (result.getQianhouhe().equals("前(多)")){
                holder.qianhou.setTextColor(Color.RED);
            }else if (result.getQianhouhe().equals("和")){
                holder.qianhou.setTextColor(view.getResources().getColor(R.color.blue_dark));
            }else {
                holder.qianhou.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.qianhou.setText(result.getQianhouhe());

            if (result.getDanshuanghe().equals("双(多)")){
                holder.danshuanghe.setTextColor(Color.RED);
            }else if (result.getDanshuanghe().equals("和")){
                holder.danshuanghe.setTextColor(view.getResources().getColor(R.color.blue_dark));
            }else {
                holder.danshuanghe.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.danshuanghe.setText(result.getDanshuanghe());

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
        @Bind(R.id.open_no9)
        TextView openNo9;
        @Bind(R.id.open_no10)
        TextView openNo10;
        @Bind(R.id.open_no11)
        TextView openNo11;
        @Bind(R.id.open_no12)
        TextView openNo12;
        @Bind(R.id.open_no13)
        TextView openNo13;
        @Bind(R.id.open_no14)
        TextView openNo14;
        @Bind(R.id.open_no15)
        TextView openNo15;
        @Bind(R.id.open_no16)
        TextView openNo16;
        @Bind(R.id.open_no17)
        TextView openNo17;
        @Bind(R.id.open_no18)
        TextView openNo18;
        @Bind(R.id.open_no19)
        TextView openNo19;
        @Bind(R.id.open_no20)
        TextView openNo20;
        @Bind(R.id.open_total)
        TextView openTotal;
        @Bind(R.id.open_total_da_xiao)
        TextView openTotalDaXiao;
        @Bind(R.id.open_total_dan_shuang)
        TextView openTotalDanShuang;
        @Bind(R.id.wuxing)
        TextView wuxing;
        @Bind(R.id.qianhou)
        TextView qianhou;
        @Bind(R.id.danshuanghe)
        TextView danshuanghe;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
