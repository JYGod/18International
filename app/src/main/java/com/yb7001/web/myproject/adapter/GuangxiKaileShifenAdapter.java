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

public class GuangxiKaileShifenAdapter extends BaseAdapter {
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

    public GuangxiKaileShifenAdapter(Context context, ArrayList<List<LoadLotteryHistory.Rows>> data) {
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
            view = LayoutInflater.from(mContex).inflate(R.layout.activity_result_guangxikuaileshifen, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        if (data!=null){
            pic1=view.getResources().getDrawable(R.drawable.circle_blue);
            pic2=view.getResources().getDrawable(R.drawable.circle_red);
            pic3=view.getResources().getDrawable(R.drawable.circle_green);
            pics=new Drawable[]{pic1,pic2,pic3};
            tvNum=new TextView[]{holder.openNo1,holder.openNo2,holder.openNo3,holder.openNo4,holder.openNo5};
            loadLotteryHistory = data.get(position);
            result = loadLotteryHistory.get(position);
            holder.openExpectNumber.setText(result.getOpenExpectNumber());
            holder.openTime.setText(result.getOpenTime());
            resultInt=new int[]{Integer.parseInt(result.getOpenNo1()),Integer.parseInt(result.getOpenNo2()),
                    Integer.parseInt(result.getOpenNo3()),Integer.parseInt(result.getOpenNo4()),Integer.parseInt(result.getOpenNo5())};
            for (int i=0;i<5;i++){
                if (resultInt[i]%3==0){
                    tvNum[i].setBackground(pics[2]);
                }else if (resultInt[i]%3==1){
                    tvNum[i].setBackground(pics[1]);
                }else if (resultInt[i]%3==2){
                    tvNum[i].setBackground(pics[0]);
                }
                tvNum[i].setText(String.valueOf(resultInt[i]));
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
            if (result.getLonghu1().equals("龙")){
                holder.longhu1.setTextColor(view.getResources().getColor(R.color.red));
            }else {
                holder.longhu1.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.longhu1.setText(result.getLonghu1());
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

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
