package com.dev.fastdevframe.main;

import android.databinding.ObservableField;

public class MainListDataItem {
    public final ObservableField<String> btnName = new ObservableField<>();
    public MainListDataItem(String btnName) {
        this.btnName.set(btnName);
    }
}
