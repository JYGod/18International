package com.yb7001.web.myproject.personcenter;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.adapter.MessagesAdapter;
import com.yb7001.web.myproject.bean.LoadMessage;
import com.yb7001.web.myproject.bean.LoadUserMessages;
import com.yb7001.web.myproject.PK10TwoSide;
import com.yb7001.web.myproject.MainGlobalData;
import com.yb7001.web.myproject.service.SoapServiceImpl;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CActivity extends Activity {
    @Bind(R.id.btn_back)
    ImageButton btnBack;
    @Bind(R.id.lv_user_message)
    ListView lvUserMessage;
    @Bind(R.id.message_title)
    TextView messageTitle;
    @Bind(R.id.btn_cancle)
    ImageView btnCancle;
    @Bind(R.id.message_content)
    TextView messageContent;
    @Bind(R.id.date_time)
    TextView dateTime;
    @Bind(R.id.alert_window)
    RelativeLayout alertWindow;
    private Context mContext;
    private ArrayList<List<LoadUserMessages.Listj>> resultList;
    private String tag;
    private MessagesAdapter userMessageAdapter;
    private String msgId;
    private String personMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_message_center);
        ButterKnife.bind(this);
        init();
        listenAction();
    }

    private void listenAction() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, PK10TwoSide.class);
                startActivity(intent);
                finish();
            }
        });

        btnCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertWindow.setVisibility(View.GONE);
            }
        });

        lvUserMessage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                msgId = resultList.get(position).get(position).getId();
                // Log.e("点击", resultList.get(position).get(position).getRowId());
                new Thread() {
                    public void run() {
                        personMsg = new SoapServiceImpl().loadUserMessageService(msgId, MainGlobalData.TOKEN);
                        Log.e("personMsg", personMsg);
                        mHandler.sendEmptyMessage(1);
                    }
                }.start();
            }
        });
    }

    private void init() {
        mContext = this;
        resultList = new ArrayList<>();
        new Thread() {
            public void run() {
                tag = new SoapServiceImpl().loadUserMessages(15, 1, MainGlobalData.TOKEN);
                mHandler.sendEmptyMessage(0);

            }
        }.start();
        userMessageAdapter = new MessagesAdapter(getApplicationContext(), resultList);
        lvUserMessage.setAdapter(userMessageAdapter);
    }


    private LoadUserMessages loadUserMessage;
    private List<LoadUserMessages.Listj> result;
    private LoadMessage loadMessage;
    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {
                if (!tag.equals("请求数据失败！")){
                    Gson gson = new Gson();
                    loadUserMessage = gson.fromJson(tag, LoadUserMessages.class);
                    ArrayList<List<LoadUserMessages.Listj>> loadUserMessages = new ArrayList<>();
                    result = loadUserMessage.getResult().getList();
                    for (int i = 0; i < 15; i++) {
                        loadUserMessages.add(result);
                    }
                    resultList = new ArrayList<>();
                    resultList.addAll(loadUserMessages);
                    userMessageAdapter.bindData(resultList);
                    lvUserMessage.setAdapter(userMessageAdapter);
                    userMessageAdapter.notifyDataSetChanged();
                }else {
                    Toast.makeText(getApplicationContext(),tag,Toast.LENGTH_SHORT).show();
                }
            } else if (msg.what == 1) {
                if (!personMsg.equals("请求数据失败！")){
                    Gson gson=new Gson();
                    loadMessage=gson.fromJson(personMsg, LoadMessage.class);
                    messageTitle.setText(loadMessage.getResult().getMessage_title());
                    messageContent.setText(loadMessage.getResult().getMessage_content());
                    dateTime.setText(loadMessage.getResult().getDate_time());
                    alertWindow.setVisibility(View.VISIBLE);
                }else {
                    Toast.makeText(getApplicationContext(),personMsg,Toast.LENGTH_SHORT).show();
                }

            }
        }
    };
}
