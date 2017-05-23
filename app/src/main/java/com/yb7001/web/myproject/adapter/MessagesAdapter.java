package com.yb7001.web.myproject.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.bean.LoadUserMessages;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MessagesAdapter extends BaseAdapter {
    private final Context context;
    private ArrayList<List<LoadUserMessages.Listj>> data;
    private List<LoadUserMessages.Listj> loadUserMessages;
    private LoadUserMessages.Listj result;
    private View view;
    private ViewHolder holder;

    public MessagesAdapter(Context context, ArrayList<List<LoadUserMessages.Listj>> data) {
        super();
        this.context = context;
        this.data = data;
    }

    public void bindData(ArrayList<List<LoadUserMessages.Listj>> list) {
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
            view = LayoutInflater.from(context).inflate(R.layout.activity_person_message, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        if (data!=null){
            loadUserMessages=data.get(position);
            result=loadUserMessages.get(position);
            holder.rowId.setText(result.getRowId());
            holder.messageTitle.setText(result.getMessage_title());
            holder.dateTime.setText(result.getDate_time());
            holder.rowId.setTag(result);
        }
        return view;
    }

    static class ViewHolder {
        @Bind(R.id.row_id)
        TextView rowId;
        @Bind(R.id.message_title)
        TextView messageTitle;
        @Bind(R.id.date_time)
        TextView dateTime;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
