package com.yb7001.web.myproject.adapter;


import android.content.Context;
import android.graphics.Color;
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

public class BeijingSaicheAdapter extends BaseAdapter {
    private ArrayList<List<LoadLotteryHistory.Rows>> data;
    private Context mContex;
    private View view;
    private ViewHolder holder;
    private Drawable pic1,pic2,pic3,pic4,pic5,pic6,pic7,pic8,pic9,pic10;
    private Drawable[] pics;
    private LoadLotteryHistory.Rows result;
    private String[] numberString;
    private ImageView[] imageViews;

    public BeijingSaicheAdapter(Context context, ArrayList<List<LoadLotteryHistory.Rows>> data) {
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
            view = LayoutInflater.from(mContex).inflate(R.layout.activity_reslut_beijingsaiche, null);
            holder=new ViewHolder(view);
            view.setTag(holder);
        }else {
            holder=(ViewHolder)view.getTag();
        }
        if (data!=null){
            pic1=view.getResources().getDrawable(R.drawable.num_1);
            pic2=view.getResources().getDrawable(R.drawable.num_2);
            pic3=view.getResources().getDrawable(R.drawable.num_3);
            pic4=view.getResources().getDrawable(R.drawable.num_4);
            pic5=view.getResources().getDrawable(R.drawable.num_5);
            pic6=view.getResources().getDrawable(R.drawable.num_6);
            pic7=view.getResources().getDrawable(R.drawable.num_7);
            pic8=view.getResources().getDrawable(R.drawable.num_8);
            pic9=view.getResources().getDrawable(R.drawable.num_9);
            pic10=view.getResources().getDrawable(R.drawable.num_10);
            pics=new Drawable[]{pic1,pic2,pic3,pic4,pic5,pic6,pic7,pic8,pic9,pic10};
            imageViews=new ImageView[]{holder.openNo1,holder.openNo2,holder.openNo3,holder.openNo4,holder.openNo5,holder.openNo6
            ,holder.openNo7,holder.openNo8,holder.openNo9,holder.openNo10};
            List<LoadLotteryHistory.Rows>loadLotteryHistory=new ArrayList<>();
            loadLotteryHistory=data.get(position);
            result=loadLotteryHistory.get(position);
            holder.openExpectNumber.setText(result.getOpenExpectNumber());
            holder.openTime.setText(result.getOpenTime());
            numberString=new String[]{result.getOpenNo1(),result.getOpenNo2(),result.getOpenNo3(),result.getOpenNo4()
            ,result.getOpenNo5(),result.getOpenNo6(),result.getOpenNo7(),result.getOpenNo8(),result.getOpenNo9(),result.getOpenNo10()};
            for (int i=0;i<10;i++){
                if (numberString[i].equals("1")){
                    imageViews[i].setImageDrawable(pics[0]);
                }else if (numberString[i].equals("2")){
                    imageViews[i].setImageDrawable(pics[1]);
                }else if (numberString[i].equals("3")){
                    imageViews[i].setImageDrawable(pics[2]);
                }else if (numberString[i].equals("4")){
                    imageViews[i].setImageDrawable(pics[3]);
                }else if (numberString[i].equals("5")){
                    imageViews[i].setImageDrawable(pics[4]);
                }else if (numberString[i].equals("6")){
                    imageViews[i].setImageDrawable(pics[5]);
                }else if (numberString[i].equals("7")){
                    imageViews[i].setImageDrawable(pics[6]);
                }else if (numberString[i].equals("8")){
                    imageViews[i].setImageDrawable(pics[7]);
                }else if (numberString[i].equals("9")){
                    imageViews[i].setImageDrawable(pics[8]);
                }else if (numberString[i].equals("10")){
                    imageViews[i].setImageDrawable(pics[9]);
                }
            }
            holder.open12Total.setText(result.getOpen1_2Total());
            if (result.getOpen1_2DaXiao().equals("大")){
                holder.open12Daxiao.setTextColor(Color.RED);
            }else {
                holder.open12Daxiao.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.open12Daxiao.setText(result.getOpen1_2DaXiao());
            if (result.getOpen1_2DanShuang().equals("双")){
                holder.open12DanShuang.setTextColor(Color.RED);
            }else {
                holder.open12DanShuang.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.open12DanShuang.setText(result.getOpen1_2DanShuang());
            if (result.getLonghu1().equals("龙")){
                holder.longhu1.setTextColor(Color.RED);
            }else {
                holder.longhu1.setTextColor(view.getResources().getColor(R.color.grey));
            }
            if (result.getLonghu2().equals("龙")){
                holder.longhu2.setTextColor(Color.RED);
            }else {
                holder.longhu2.setTextColor(view.getResources().getColor(R.color.grey));
            }
            if (result.getLonghu3().equals("龙")){
                holder.longhu3.setTextColor(Color.RED);
            }else {
                holder.longhu3.setTextColor(view.getResources().getColor(R.color.grey));
            }
            if (result.getLonghu4().equals("龙")){
                holder.longhu4.setTextColor(Color.RED);
            }else {
                holder.longhu4.setTextColor(view.getResources().getColor(R.color.grey));
            }
            if (result.getLonghu5().equals("龙")){
                holder.longhu5.setTextColor(Color.RED);
            }else {
                holder.longhu5.setTextColor(view.getResources().getColor(R.color.grey));
            }
            holder.longhu1.setText(result.getLonghu1());
            holder.longhu2.setText(result.getLonghu2());
            holder.longhu3.setText(result.getLonghu3());
            holder.longhu4.setText(result.getLonghu4());
            holder.longhu5.setText(result.getLonghu5());

        }
        return view;
    }



    class ViewHolder {
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
        @Bind(R.id.open_no4)
        ImageView openNo4;
        @Bind(R.id.open_no5)
        ImageView openNo5;
        @Bind(R.id.open_no6)
        ImageView openNo6;
        @Bind(R.id.open_no7)
        ImageView openNo7;
        @Bind(R.id.open_no8)
        ImageView openNo8;
        @Bind(R.id.open_no9)
        ImageView openNo9;
        @Bind(R.id.open_no10)
        ImageView openNo10;
        @Bind(R.id.open_1_2_total)
        TextView open12Total;
        @Bind(R.id.open1_2_Daxiao)
        TextView open12Daxiao;
        @Bind(R.id.open1_2_dan_shuang)
        TextView open12DanShuang;
        @Bind(R.id.longhu1)
        TextView longhu1;
        @Bind(R.id.longhu2)
        TextView longhu2;
        @Bind(R.id.longhu3)
        TextView longhu3;
        @Bind(R.id.longhu4)
        TextView longhu4;
        @Bind(R.id.longhu5)
        TextView longhu5;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
