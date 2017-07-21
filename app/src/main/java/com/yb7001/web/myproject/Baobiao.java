package com.yb7001.web.myproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.tencent.bugly.crashreport.CrashReport;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.yb7001.web.myproject.adapter.BaobiaoAdapter;
import com.yb7001.web.myproject.bean.LoadUserBets;
import com.yb7001.web.myproject.service.SoapServiceImpl;

import java.util.Calendar;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Baobiao extends Activity implements DatePickerDialog.OnDateSetListener {
    @Bind(R.id.btn_back)
    ImageButton btnBack;
    @Bind(R.id.select_date_1)
    TextView selectDate1;
    @Bind(R.id.select_dete_2)
    TextView selectDete2;
    @Bind(R.id.btn_search)
    Button btnSearch;
    @Bind(R.id.lv_baobiao)
    ListView lvBaobiao;
    @Bind(R.id.bet_money)
    TextView betMoney;
    @Bind(R.id.bet_acount)
    TextView betAcount;
    @Bind(R.id.progressBar)
    ProgressBar progressBar;
    private String today;
    private int mCurrentDay;
    private int mDay;
    private int mMonth;
    private int mYear;
    private String twoWeekAgo;
    private String result;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baobiao);
        ButterKnife.bind(this);
        CrashReport.initCrashReport(getApplicationContext(), "16e5be7f65", true);
        init();
        listenAction();

    }

    private void init() {
        mContext = this;
        Calendar now = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        mCurrentDay = c.get(Calendar.DAY_OF_MONTH);
        c.set(Calendar.DAY_OF_MONTH, mCurrentDay - 14);
        mDay = c.get(Calendar.DAY_OF_MONTH);
        mMonth = c.get(Calendar.MONTH) + 1;
        mYear = c.get(Calendar.YEAR);
        twoWeekAgo = mYear + "/" + mMonth + "/" + mDay;
        today = now.get(Calendar.YEAR) + "/" + (now.get(Calendar.MONTH) + 1) + "/" + now.get(Calendar.DAY_OF_MONTH);
        selectDete2.setText(today);
        selectDate1.setText(twoWeekAgo);
    }

    private void listenAction() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(mContext, PK10TwoSide.class);
//                startActivity(intent);
                finish();
            }
        });

        selectDate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                DatePickerDialog dpd = DatePickerDialog.newInstance(
                        Baobiao.this,
                        now.get(Calendar.YEAR),
                        now.get(Calendar.MONTH),
                        now.get(Calendar.DAY_OF_MONTH)
                );
                dpd.setAccentColor(getResources().getColor(R.color.blue_dark));
                dpd.setOkText("选择");
                dpd.setCancelText("取消");
                dpd.show(getFragmentManager(), "Datepickerdialog");
                dpd.setOnDateSetListener(new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
                        selectDate1.setText(year + "/" + (monthOfYear + 1) + "/" + dayOfMonth);
                        Log.e("xuanze", year + "   " + (monthOfYear + 1) + "    " + dayOfMonth);
                    }
                });
            }
        });

        selectDete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                DatePickerDialog dpd = DatePickerDialog.newInstance(
                        Baobiao.this,
                        now.get(Calendar.YEAR),
                        now.get(Calendar.MONTH),
                        now.get(Calendar.DAY_OF_MONTH)
                );
                dpd.setAccentColor(getResources().getColor(R.color.blue_dark));
                dpd.setOkText("选择");
                dpd.setCancelText("取消");
                dpd.show(getFragmentManager(), "Datepickerdialog");
                dpd.setOnDateSetListener(new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
                        selectDete2.setText(year + "/" + (monthOfYear + 1) + "/" + dayOfMonth);
                        Log.e("xuanze", year + "   " + (monthOfYear + 1) + "    " + dayOfMonth);
                    }
                });
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSearch.setEnabled(false);
                progressBar.setVisibility(View.VISIBLE);
                new Thread() {
                    public void run() {
                        // String  messages=new SoapServiceImpl().loadUserMessages(10,1,MainGlobalData.TOKEN);
                        result = new SoapServiceImpl().loadUserReportService(selectDate1.getText().toString() + "  00:00:00", selectDete2.getText().toString() + "  23:59:59", 5, 1, MainGlobalData.TOKEN);
                        Log.e("报表", result);
                        mHandler.sendEmptyMessage(0);
                    }
                }.start();
            }
        });
    }

    private LoadUserBets userBets;
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {
                if (result.equals("请求数据失败！")) {
                    progressBar.setVisibility(View.GONE);
                    btnSearch.setEnabled(true);
                    Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                } else {
                    Gson gson = new Gson();
                    userBets = gson.fromJson(result, LoadUserBets.class);
                    betMoney.setText(userBets.getResult().getFooter().get(1).getBetMoney());
                    betAcount.setText(userBets.getResult().getFooter().get(1).getBetAcount());
                    BaobiaoAdapter adapter = new BaobiaoAdapter(mContext, userBets.getResult().getRows());
                    lvBaobiao.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);
                    btnSearch.setEnabled(true);
                }
            }
        }
    };

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {

    }
}
