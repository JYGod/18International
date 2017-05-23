package com.yb7001.web.myproject;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.PopupMenu;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.gson.Gson;
import com.tencent.bugly.crashreport.CrashReport;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.yb7001.web.myproject.adapter.BeijingKuaileAdapter;
import com.yb7001.web.myproject.adapter.BeijingSaicheAdapter;
import com.yb7001.web.myproject.adapter.ChongqinShishicaiAdapter;
import com.yb7001.web.myproject.adapter.GuangdongAdapter;
import com.yb7001.web.myproject.adapter.GuangdongKuaileShifenAdapter;
import com.yb7001.web.myproject.adapter.GuangxiKaileShifenAdapter;
import com.yb7001.web.myproject.adapter.GuangxiKuaiAdapter;
import com.yb7001.web.myproject.bean.LoadLotteryHistory;
import com.yb7001.web.myproject.service.SoapServiceImpl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import butterknife.Bind;
import butterknife.ButterKnife;

public class kaijiang_result extends Activity implements DatePickerDialog.OnDateSetListener {
    @Bind(R.id.btn_back)
    ImageButton btnBack;
    @Bind(R.id.btn_search)
    Button btnSearch;
    @Bind(R.id.lv_result)
    ListView mListView;
    @Bind(R.id.date_picker)
    LinearLayout datePicker;
    @Bind(R.id.tv_date)
    TextView tvDate;
    @Bind(R.id.select_1)
    LinearLayout select1;
    @Bind(R.id.tv_select_1)
    TextView tvSelect1;
    @Bind(R.id.btn_pre)
    Button btnPre;
    @Bind(R.id.et_page)
    EditText etPage;
    @Bind(R.id.btn_go)
    Button btnGo;
    @Bind(R.id.tv_yeshu)
    TextView tvYeshu;
    @Bind(R.id.btn_next)
    Button btnNext;
    @Bind(R.id.progressBar)
    ProgressBar progressBar;
    private String startTime;
    private String endTime;
    private String tag;
    private Context mContext;
    private ArrayList<List<LoadLotteryHistory.Rows>> resultList;
    private BeijingKuaileAdapter beijingkuaileAdapter;
    private int index;
    private LoadLotteryHistory loadLotteryHistory;
    private String dateSelect;
    private String pankou;
    private String ActivityTag;
    private String nowStart, nowEnd;
    private String lotteryCode;
    private BeijingSaicheAdapter beijingsaicheAdapter;
    private String test = "";
    private ChongqinShishicaiAdapter chongqinshishicaiAdapter;
    private GuangxiKuaiAdapter guangxikuaiAdapter;
    private GuangxiKaileShifenAdapter guangxikuaileshifenAdapter;
    private GuangdongAdapter guangdongAdapter;
    private GuangdongKuaileShifenAdapter guangdongkaileshifenAdapter;
    private String total;
    private LoadLotteryHistory totalLoadHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kaijiang_result);
        ButterKnife.bind(this);
        CrashReport.initCrashReport(getApplicationContext(), "jy000", true);
        init();
    }


    private void init() {
        mContext = this;
        page = 0;
        pageIndex = 1;
        Intent intent = getIntent();
        dateSelect = intent.getStringExtra("date");
        ActivityTag = intent.getStringExtra("select");
        lotteryCode = intent.getStringExtra("template");
        if (ActivityTag == null) {
            ActivityTag = "北京赛车(PK10)";
        }
        if (lotteryCode == null) {
            lotteryCode = "BJPK10";
        }
        tvSelect1.setText(ActivityTag);
        Calendar now = Calendar.getInstance();
        nowStart = now.get(Calendar.YEAR) + "/" + (now.get(Calendar.MONTH) + 1) + "/" + now.get(Calendar.DAY_OF_MONTH) + "  00:00:00";
        nowEnd = now.get(Calendar.YEAR) + "/" + (now.get(Calendar.MONTH) + 1) + "/" + now.get(Calendar.DAY_OF_MONTH) + "  23:59:59";
        if (dateSelect == null) {
            tvDate.setText(now.get(Calendar.YEAR) + "/" + (now.get(Calendar.MONTH) + 1) + "/" + now.get(Calendar.DAY_OF_MONTH));
        } else {
            tvDate.setText(dateSelect);
        }
        resultList = new ArrayList<>();
        progressBar.setVisibility(View.VISIBLE);
        new Thread() {
            public void run() {
                total = new SoapServiceImpl().loadLotteryHistoryService(lotteryCode, nowStart, nowEnd, 300, 1, MainGlobalData.TOKEN);
                // test=new SoapServiceImpl().loadLotteryHistoryService("F3D",nowStart, nowEnd, 300, 1, MainGlobalData.TOKEN);
                tag = new SoapServiceImpl().loadLotteryHistoryService(lotteryCode, nowStart, nowEnd, 30, pageIndex, MainGlobalData.TOKEN);
                Gson gson = new Gson();
                loadLotteryHistory = gson.fromJson(tag, LoadLotteryHistory.class);
                totalLoadHistory = gson.fromJson(total, LoadLotteryHistory.class);
                index = totalLoadHistory.getResult().getRows().size();//记录总数
                if (index % 30 == 0) {
                    page = index / 30;
                } else {
                    page = index / 30 + 1;
                }
                mHandler.sendEmptyMessage(0);
            }
        }.start();
        if (lotteryCode.equals("BJPK10")) {
            beijingsaicheAdapter = new BeijingSaicheAdapter(getApplicationContext(), resultList);
            mListView.setAdapter(beijingsaicheAdapter);
        } else if (lotteryCode.equals("BJKL8")) {
            beijingkuaileAdapter = new BeijingKuaileAdapter(getApplicationContext(), resultList);
            mListView.setAdapter(beijingkuaileAdapter);
        } else if (lotteryCode.equals("CQSSC") || lotteryCode.equals("XJSSC") || lotteryCode.equals("TJSSC")) {
            chongqinshishicaiAdapter = new ChongqinShishicaiAdapter(getApplicationContext(), resultList);
            mListView.setAdapter(chongqinshishicaiAdapter);
        } else if (lotteryCode.equals("GXK3")) {
            guangxikuaiAdapter = new GuangxiKuaiAdapter(getApplicationContext(), resultList);
            mListView.setAdapter(guangxikuaiAdapter);
        } else if (lotteryCode.equals("GXKLSF")) {
            guangxikuaileshifenAdapter = new GuangxiKaileShifenAdapter(getApplicationContext(), resultList);
            mListView.setAdapter(guangxikuaileshifenAdapter);
        } else if (lotteryCode.equals("GD11X5")) {
            guangdongAdapter = new GuangdongAdapter(getApplicationContext(), resultList);
            mListView.setAdapter(guangdongAdapter);
        } else if (lotteryCode.equals("GDKLSF") || lotteryCode.equals("XYNC")) {
            guangdongkaileshifenAdapter = new GuangdongKuaileShifenAdapter(getApplicationContext(), resultList);
            mListView.setAdapter(guangdongkaileshifenAdapter);
        }
        MainGlobalData.isFirstPick = false;


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
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pageIndex > 1) {
                    startTime = tvDate.getText().toString() + "  00:00:00";
                    endTime = tvDate.getText().toString() + "  23:59:59";
                    pageIndex--;
                    new Thread() {
                        public void run() {
                            total = new SoapServiceImpl().loadLotteryHistoryService(lotteryCode, startTime, endTime, 300, 1, MainGlobalData.TOKEN);
                            tag = new SoapServiceImpl().loadLotteryHistoryService(lotteryCode, startTime, endTime, 30, pageIndex, MainGlobalData.TOKEN);
                            Gson gson = new Gson();
                            loadLotteryHistory = gson.fromJson(tag, LoadLotteryHistory.class);
                            totalLoadHistory = gson.fromJson(total, LoadLotteryHistory.class);
                            index = totalLoadHistory.getResult().getRows().size();//记录总数
                            if (index % 30 == 0) {
                                page = index / 30;
                            } else {
                                page = index / 30 + 1;
                            }
                            mHandler.sendEmptyMessage(0);
                        }
                    }.start();
                }
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pageIndex < page) {
                    startTime = tvDate.getText().toString() + "  00:00:00";
                    endTime = tvDate.getText().toString() + "  23:59:59";
                    pageIndex++;
                    new Thread() {
                        public void run() {
                            total = new SoapServiceImpl().loadLotteryHistoryService(lotteryCode, startTime, endTime, 300, 1, MainGlobalData.TOKEN);
                            tag = new SoapServiceImpl().loadLotteryHistoryService(lotteryCode, startTime, endTime, 30, pageIndex, MainGlobalData.TOKEN);
                            Gson gson = new Gson();
                            loadLotteryHistory = gson.fromJson(tag, LoadLotteryHistory.class);
                            totalLoadHistory = gson.fromJson(total, LoadLotteryHistory.class);
                            index = totalLoadHistory.getResult().getRows().size();//记录总数
                            if (index % 30 == 0) {
                                page = index / 30;
                            } else {
                                page = index / 30 + 1;
                            }
                            mHandler.sendEmptyMessage(0);
                        }
                    }.start();
                }
            }
        });
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTime = tvDate.getText().toString() + "  00:00:00";
                endTime = tvDate.getText().toString() + "  23:59:59";
                if (!etPage.getText().toString().equals("")) {
                    pageIndex = Integer.parseInt(etPage.getText().toString());
                }
                new Thread() {
                    public void run() {
                        total = new SoapServiceImpl().loadLotteryHistoryService(lotteryCode, startTime, endTime, 300, 1, MainGlobalData.TOKEN);
                        tag = new SoapServiceImpl().loadLotteryHistoryService(lotteryCode, startTime, endTime, 30, pageIndex, MainGlobalData.TOKEN);
                        Log.e("记录", tag);
                        Gson gson = new Gson();
                        loadLotteryHistory = gson.fromJson(tag, LoadLotteryHistory.class);
                        totalLoadHistory = gson.fromJson(total, LoadLotteryHistory.class);
                        index = totalLoadHistory.getResult().getRows().size();//记录总数
                        if (index % 30 == 0) {
                            page = index / 30;
                        } else {
                            page = index / 30 + 1;
                        }
                        mHandler.sendEmptyMessage(0);
                    }
                }.start();
            }
        });
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etPage.getText().toString().equals("") && Integer.parseInt(etPage.getText().toString()) > 0 && Integer.parseInt(etPage.getText().toString()) <= page) {
                    pageIndex = Integer.parseInt(etPage.getText().toString());
                    startTime = tvDate.getText().toString() + "  00:00:00";
                    endTime = tvDate.getText().toString() + "  23:59:59";
                    new Thread() {
                        public void run() {
                            total = new SoapServiceImpl().loadLotteryHistoryService(lotteryCode, startTime, endTime, 300, 1, MainGlobalData.TOKEN);
                            tag = new SoapServiceImpl().loadLotteryHistoryService(lotteryCode, startTime, endTime, 30, pageIndex, MainGlobalData.TOKEN);
                            Log.e("记录", tag);
                            Gson gson = new Gson();
                            loadLotteryHistory = gson.fromJson(tag, LoadLotteryHistory.class);
                            totalLoadHistory = gson.fromJson(total, LoadLotteryHistory.class);
                            index = totalLoadHistory.getResult().getRows().size();//记录总数
                            if (index % 30 == 0) {
                                page = index / 30;
                            } else {
                                page = index / 30 + 1;
                            }
                            mHandler.sendEmptyMessage(0);
                        }
                    }.start();
                }

            }
        });
        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                DatePickerDialog dpd = DatePickerDialog.newInstance(
                        kaijiang_result.this,
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
                        tvDate.setText(year + "/" + (monthOfYear + 1) + "/" + dayOfMonth);
                        Log.e("xuanze", year + "   " + (monthOfYear + 1) + "    " + dayOfMonth);
                    }
                });

                Log.e("ss", String.valueOf(dpd.getStartDate()));
            }
        });

        select1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(mContext, v);
                popupMenu.getMenuInflater().inflate(R.menu.pop_menu_1, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent;
                        switch (item.getItemId()) {
                            case R.id.bjsc:
                                intent = new Intent(mContext, kaijiang_result.class);
                                intent.putExtra("select", "北京赛车(PK10)");
                                intent.putExtra("template", "BJPK10");
                                startActivity(intent);
                                finish();
                                break;
                            case R.id.cqssc:
                                intent = new Intent(mContext, kaijiang_result.class);
                                intent.putExtra("select", "重庆时时彩");
                                intent.putExtra("template", "CQSSC");
                                startActivity(intent);
                                finish();
                                break;
                            case R.id.bjkl:
                                intent = new Intent(mContext, kaijiang_result.class);
                                intent.putExtra("select", "北京快乐8");
                                intent.putExtra("template", "BJKL8");
                                startActivity(intent);
                                finish();
                                break;
                            case R.id.gxk:
                                intent = new Intent(mContext, kaijiang_result.class);
                                intent.putExtra("select", "广西快3");
                                intent.putExtra("template", "GXK3");
                                startActivity(intent);
                                finish();
                                break;
                            case R.id.gxkl:
                                intent = new Intent(mContext, kaijiang_result.class);
                                intent.putExtra("select", "广西快乐十分");
                                intent.putExtra("template", "GXKLSF");
                                startActivity(intent);
                                finish();
                                break;
                            case R.id.gd:
                                intent = new Intent(mContext, kaijiang_result.class);
                                intent.putExtra("select", "广东11选5");
                                intent.putExtra("template", "GD11X5");
                                startActivity(intent);
                                finish();
                                break;
                            case R.id.xglhc:
                                break;
                            case R.id.xjssc:
                                intent = new Intent(mContext, kaijiang_result.class);
                                intent.putExtra("select", "新疆时时彩");
                                intent.putExtra("template", "XJSSC");
                                startActivity(intent);
                                finish();
                                break;
                            case R.id.tjssc:
                                intent = new Intent(mContext, kaijiang_result.class);
                                intent.putExtra("select", "天津时时彩");
                                intent.putExtra("template", "TJSSC");
                                startActivity(intent);
                                finish();
                                break;
                            case R.id.gdkl:
                                intent = new Intent(mContext, kaijiang_result.class);
                                intent.putExtra("select", "广东快乐十分");
                                intent.putExtra("template", "GDKLSF");
                                startActivity(intent);
                                finish();
                                break;
                            case R.id.fc:

                                break;
                            case R.id.tcpl:

                                break;
                            case R.id.cqxync:
                                intent = new Intent(mContext, kaijiang_result.class);
                                intent.putExtra("select", "重庆幸运农场");
                                intent.putExtra("template", "XYNC");
                                startActivity(intent);
                                finish();
                                break;
                            default:
                                break;
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });

    }

    private List<LoadLotteryHistory.Rows> result;
    private int page;
    private int pageIndex;
    private int circle;
    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {
                ArrayList<List<LoadLotteryHistory.Rows>> loadLotteryHistories = new ArrayList<>();
                result = loadLotteryHistory.getResult().getRows();
                if (index < 30) {
                    circle = index;
                } else {
                    circle = 30;
                }
                for (int i = 0; i < circle; i++) {
                    loadLotteryHistories.add(result);
                }
                tvYeshu.setText("共" + String.valueOf(index) + "笔记录 共" + String.valueOf(page) + "页");
                etPage.setText(String.valueOf(pageIndex));
                resultList = new ArrayList<>();
                resultList.addAll(loadLotteryHistories);
                if (lotteryCode.equals("BJPK10")) {
                    beijingsaicheAdapter.bindData(resultList);
                    mListView.setAdapter(beijingsaicheAdapter);
                    beijingsaicheAdapter.notifyDataSetChanged();
                } else if (lotteryCode.equals("BJKL8")) {
                    beijingkuaileAdapter.bindData(resultList);
                    mListView.setAdapter(beijingkuaileAdapter);
                    beijingkuaileAdapter.notifyDataSetChanged();
                } else if (lotteryCode.equals("CQSSC") || lotteryCode.equals("XJSSC") || lotteryCode.equals("TJSSC")) {
                    chongqinshishicaiAdapter.bindData(resultList);
                    mListView.setAdapter(chongqinshishicaiAdapter);
                    chongqinshishicaiAdapter.notifyDataSetChanged();
                } else if (lotteryCode.equals("GXK3")) {
                    guangxikuaiAdapter.bindData(resultList);
                    mListView.setAdapter(guangxikuaiAdapter);
                    guangxikuaiAdapter.notifyDataSetChanged();
                } else if (lotteryCode.equals("GXKLSF")) {
                    guangxikuaileshifenAdapter.bindData(resultList);
                    mListView.setAdapter(guangxikuaileshifenAdapter);
                    guangxikuaileshifenAdapter.notifyDataSetChanged();
                } else if (lotteryCode.equals("GD11X5")) {
                    guangdongAdapter.bindData(resultList);
                    mListView.setAdapter(guangdongAdapter);
                    guangdongAdapter.notifyDataSetChanged();
                } else if (lotteryCode.equals("GDKLSF") || lotteryCode.equals("XYNC")) {
                    guangdongkaileshifenAdapter.bindData(resultList);
                    mListView.setAdapter(guangdongkaileshifenAdapter);
                    guangdongkaileshifenAdapter.notifyDataSetChanged();
                }
                Log.e("tag", tag);
                progressBar.setVisibility(View.GONE);
                listenAction();
            }
        }
    };

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {

    }
}
