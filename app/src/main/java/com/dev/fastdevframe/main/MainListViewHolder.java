package com.dev.fastdevframe.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

public class MainListViewHolder extends RecyclerView.ViewHolder {

    protected MainRecyclerItemBinding dataBinding;

    public MainListViewHolder(@NonNull MainRecyclerItemBinding dataBinding) {
        super(dataBinding.getRoot());
        this.dataBinding = dataBinding;
    }

    public MainRecyclerItemBinding getDataBinding() {
        return this.dataBinding;
    }
}
