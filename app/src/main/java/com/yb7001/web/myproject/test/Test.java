package com.yb7001.web.myproject.test;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.yb7001.web.myproject.R;

import java.util.ArrayList;

public class Test extends RxAppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.test);
       // binding.setVariable(BR.viewModel,new TestViewModel(this));
        //binding.setVariable(B,new TestViewModel(this));
        ArrayList<View> smallLayouts=new ArrayList<>();
        int[] counts=new int[5];
        LinearLayout mLinear = (LinearLayout) this.findViewById(R.id.box);
        for (int i=0;i<5;i++){
         View mInflate = View.inflate(this, R.layout.test_small, null);
         mInflate.setId(mInflate.generateViewId());
         Log.e("id", String.valueOf(mInflate.getId()));
         View temp = mInflate.findViewById(R.id.small);
         smallLayouts.add(temp);
         mLinear.addView(mInflate);
         counts[i]=0;
         int finalI = i;
         int finalI1 = i;
         smallLayouts.get(i).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        counts[finalI]++;
        }
         });

        }



    }
}

