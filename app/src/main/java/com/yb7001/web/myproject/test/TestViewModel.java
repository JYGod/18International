package com.yb7001.web.myproject.test;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.ObservableBoolean;
import android.util.Log;

import com.kelin.mvvmlight.base.ViewModel;
import com.kelin.mvvmlight.command.ReplyCommand;
import com.yb7001.web.myproject.Login;

public class TestViewModel implements ViewModel {
    private Activity activity;
    public final ObservableBoolean isChanging=new ObservableBoolean(false);
    


    public ReplyCommand onClick=new ReplyCommand(()->{
        Intent intent=new Intent(activity,Login.class);
        activity.startActivity(intent);
        activity.finish();
    });
    public ReplyCommand onCheckChange=new ReplyCommand(()->{
        if (isChanging.equals(false)){
            isChanging.set(true);
        }else {
            isChanging.set(false);
        }
        Log.e("click", String.valueOf(isChanging.get()));
    });

    public TestViewModel(Activity activity) {
        this.activity = activity;
    }
}
