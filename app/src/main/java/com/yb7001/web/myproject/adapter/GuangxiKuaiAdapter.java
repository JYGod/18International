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

public class GuangxiKuaiAdapter extends BaseAdapter {
    private Context mContex;
    private ArrayList<List<LoadLotteryHistory.Rows>> data;
    private View view;
    private ViewHolder holder;
    private List<LoadLotteryHistory.Rows> loadLotteryHistory;
    private LoadLotteryHistory.Rows result;
    private Drawable pic1, pic2, pic3, pic4, pic5, pic6;
    private Drawable[] pics;
    private ImageView[] imageViews;
    private String[] resultSting;

    public GuangxiKuaiAdapter(Context context, ArrayList<List<LoadLotteryHistory.Rows>> data) {
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
            view = LayoutInflater.from(mContex).inflate(R.layout.activity_result_guangxikuai, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        if (data != null) {
            pic1 = view.getResources().getDrawable(R.drawable.ball_4_01);
            pic2 = view.getResources().getDrawable(R.drawable.ball_4_02);
            pic3 = view.getResources().getDrawable(R.drawable.ball_4_03);
            pic4 = view.getResources().getDrawable(R.drawable.ball_4_04);
            pic5 = view.getResources().getDrawable(R.drawable.ball_4_05);
            pic6 = view.getResources().getDrawable(R.drawable.ball_4_06);
            pics = new Drawable[]{pic1, pic2, pic3, pic4, pic5, pic6};
            imageViews = new ImageView[]{holder.openNo1, holder.openNo2, holder.openNo3};
            loadLotteryHistory = data.get(position);
            result = loadLotteryHistory.get(position);
            resultSting = new String[]{result.getOpenNo1(), result.getOpenNo2(), result.getOpenNo3()};
            holder.openExpectNumber.setText(result.getOpenExpectNumber());
            holder.openTime.setText(result.getOpenTime());
            for (int i = 0; i < 3; i++) {
                if (resultSting[i].equals("1")) {
                    imageViews[i].setImageDrawable(pics[0]);
                } else if (resultSting[i].equals("2")) {
                    imageViews[i].setImageDrawable(pics[1]);
                } else if (resultSting[i].equals("3")) {
                    imageViews[i].setImageDrawable(pics[2]);
                } else if (resultSting[i].equals("4")) {
                    imageViews[i].setImageDrawable(pics[3]);
                } else if (resultSting[i].equals("5")) {
                    imageViews[i].setImageDrawable(pics[4]);
                } else if (resultSting[i].equals("6")) {
                    imageViews[i].setImageDrawable(pics[5]);
                }
            }
            if (result.getOpenNoName1().equals("虾")||result.getOpenNoName1().equals("螃蟹")){
                holder.openNoName1.setTextColor(view.getResources().getColor(R.color.green));
            }else  if (result.getOpenNoName1().equals("鷄")||result.getOpenNoName1().equals("鱼")){
                holder.openNoName1.setTextColor(view.getResources().getColor(R.color.red));
            }else  if (result.getOpenNoName1().equals("金钱")||result.getOpenNoName1().equals("葫芦")){
                holder.openNoName1.setTextColor(view.getResources().getColor(R.color.blue_dark));
            }
            holder.openNoName1.setText(result.getOpenNoName1());
            if (result.getOpenNoName2().equals("虾")||result.getOpenNoName2().equals("螃蟹")){
                holder.openNoName2.setTextColor(view.getResources().getColor(R.color.green));
            }else  if (result.getOpenNoName2().equals("鷄")||result.getOpenNoName2().equals("鱼")){
                holder.openNoName2.setTextColor(view.getResources().getColor(R.color.red));
            }else  if (result.getOpenNoName2().equals("金钱")||result.getOpenNoName2().equals("葫芦")){
                holder.openNoName2.setTextColor(view.getResources().getColor(R.color.blue_dark));
            }
            holder.openNoName2.setText(result.getOpenNoName2());
            if (result.getOpenNoName3().equals("虾")||result.getOpenNoName3().equals("螃蟹")){
                holder.openNoName3.setTextColor(view.getResources().getColor(R.color.green));
            }else  if (result.getOpenNoName3().equals("鷄")||result.getOpenNoName3().equals("鱼")){
                holder.openNoName3.setTextColor(view.getResources().getColor(R.color.red));
            }else  if (result.getOpenNoName3().equals("金钱")||result.getOpenNoName3().equals("葫芦")){
                holder.openNoName3.setTextColor(view.getResources().getColor(R.color.blue_dark));
            }
            holder.openNoName3.setText(result.getOpenNoName3());
            holder.openTotal.setText(result.getOpenTotal());
            if (result.getOpen7DaXiao().equals("大")){
                holder.open7DaXiao.setTextColor(view.getResources().getColor(R.color.red));
            }else {
                holder.open7DaXiao.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.open7DaXiao.setText(result.getOpen7DaXiao());
        }

        return view;
    }


    static class ViewHolder {
        @Bind(R.id.open_expect_number)
        TextView openExpectNumber;
        @Bind(R.id.open_time)
        TextView openTime;
        @Bind(R.id.open_no1)
        ImageView openNo1;
        @Bind(R.id.open_no2)
        ImageView openNo2;
        @Bind(R.id.open_no3)
        ImageView openNo3;
        @Bind(R.id.open_no_name_1)
        TextView openNoName1;
        @Bind(R.id.open_no_name_2)
        TextView openNoName2;
        @Bind(R.id.open_no_name_3)
        TextView openNoName3;
        @Bind(R.id.open_total)
        TextView openTotal;
        @Bind(R.id.open7_da_xiao)
        TextView open7DaXiao;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
