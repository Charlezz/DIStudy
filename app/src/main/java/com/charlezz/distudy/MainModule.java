package com.charlezz.distudy;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.charlezz.distudy.databinding.ActivityMainBinding;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    @ActivityScope
    ActivityMainBinding provideBinding(MainActivity activity){
        return DataBindingUtil.setContentView(activity, R.layout.activity_main);
    }

    @Provides
    @ActivityScope
    MainAdapter provideAdapter(){
        return new MainAdapter();
    }

    @Provides
    @ActivityScope
    RecyclerView.LayoutManager provideLayoutManager(MainActivity activity){
        return new LinearLayoutManager(activity);
    }

    @Provides
    @ActivityScope
    MainViewModel provideMainViewModel(String str){
        return new MainViewModel(str);
    }
}
