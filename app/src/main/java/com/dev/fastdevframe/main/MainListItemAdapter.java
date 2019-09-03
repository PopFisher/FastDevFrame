package com.dev.fastdevframe.main;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.fastdevframe.R;

import java.util.List;

public class MainListItemAdapter extends RecyclerView.Adapter<MainListViewHolder> {

    private List<MainListDataItem> mItemDataList;

    private View.OnClickListener mOnItemClickListener;

    public MainListItemAdapter(@NonNull List<MainListDataItem> itemDataList, View.OnClickListener clickListener) {
        this.mItemDataList = itemDataList;
        this.mOnItemClickListener = clickListener;
    }

    @NonNull
    @Override
    public MainListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        MainRecyclerItemBinding itemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),
                R.layout.activity_main_recyclerview_item, viewGroup,false);
        return new MainListViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MainListViewHolder mainListViewHolder, int i) {
        MainListDataItem itemData = mItemDataList.get(i);
        MainRecyclerItemBinding itemBinding = mainListViewHolder.getDataBinding();
        itemBinding.setMainItemData(itemData);
        itemBinding.mainRecyclerItemBtn.setTag(i);
        itemBinding.mainRecyclerItemBtn.setOnClickListener(this.mOnItemClickListener);
    }

    @Override
    public int getItemCount() {
        return (this.mItemDataList == null) ? 0 : this.mItemDataList.size();
    }
}
