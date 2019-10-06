package com.charlezz.distudy;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel {

    private String str;

    private MutableLiveData<List<MainItem>> items = new MutableLiveData<>();

    public MainViewModel(String str) {
        this.str = str;
    }

    public void load(){

        ArrayList<MainItem> tempItems = new ArrayList<>();
        for(int i=0; i<100;i++){
            tempItems.add(new MainItem(str + i));
        }
        items.postValue(tempItems);
    }

    public String getStr() {
        return str;
    }

    public MutableLiveData<List<MainItem>> getItems() {
        return items;
    }
}
