package com.charlezz.distudy;

import androidx.databinding.BaseObservable;

public class MainItem extends BaseObservable {

    private String name;

    public MainItem(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }
}
