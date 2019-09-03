package com.dev.fastdevframe.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.dev.fastdevframe.R;
import com.dev.fastdevframe.common.RouterPath;
import com.dev.fastdevframe.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView() {
        List<MainListDataItem> listDataItems = new ArrayList<>();
        listDataItems.add(new MainListDataItem("DataBinding-MVVM"));
        MainListItemAdapter adapter = new MainListItemAdapter(listDataItems, mOnClickListener);
        mMainBinding.mainRecyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mMainBinding.mainRecyclerView.setLayoutManager(linearLayoutManager);
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final int itemIndex = (int) v.getTag();
            switch (itemIndex) {
                case 0:
                    ARouter.getInstance().build(RouterPath.APP_DataBindingActivity).navigation(MainActivity.this);
                default:
                    break;
            }
        }
    };
}
