package com.yb7001.web.myproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.MainGlobalData;

import java.util.ArrayList;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;



public class BetsAdapter extends BaseAdapter {
    private Context mContex;
    private ArrayList<Map<String, Object>> data;
    private View view;
    private ViewHolder holder;
    private int pos;
    private String res="";

    public BetsAdapter(Context context, ArrayList<Map<String, Object>> data) {
        super();
        this.mContex = context;
        this.data = data;
    }

    public void bindData(ArrayList<Map<String, Object>> list) {
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
            view = LayoutInflater.from(mContex).inflate(R.layout.activity_bets, null);
            holder=new ViewHolder(view);
            view.setTag(holder);
        }else {
            holder=(ViewHolder)view.getTag();
        }

        if (data!=null){
            if (MainGlobalData.isDefault==true){
                holder.etAmount.setText(MainGlobalData.DEFAULT_MONEY);
            }
            holder.tvTitle.setText((String) data.get(position).get("title"));
            holder.tvContent.setText((String)data.get(position).get("content"));
            holder.tvPeilv.setText((String)data.get(position).get("peilv"));
            //holder.etAmount.setTag(holder.etAmount.getText().toString());
            pos=position;
            holder.etAmount.setText(MainGlobalData.DEFAULT_MONEY.equals("")?"":MainGlobalData.DEFAULT_MONEY);
            holder.etAmount.setTag(position);
           // holder.etAmount.addTextChangedListener(watcher);
            //holder.etAmount.setTag(pos,res);
        }
        return view;
    }


    static class ViewHolder {
        @Bind(R.id.tv_title)
        TextView tvTitle;
        @Bind(R.id.tv_content)
        TextView tvContent;
        @Bind(R.id.tv_peilv)
        TextView tvPeilv;
        @Bind(R.id.et_amount)
        EditText etAmount;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
