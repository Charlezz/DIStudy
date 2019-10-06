package com.charlezz.distudy;

import android.os.Bundle;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import com.charlezz.distudy.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {


    @Inject
    String str;

    @Inject
    ActivityMainBinding binding;

    @Inject
    MainViewModel viewModel;

    @Inject
    MainAdapter adapter;

    @Inject
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.setLifecycleOwner(this);
        binding.recyclerView.setLayoutManager(layoutManager);
        binding.recyclerView.setAdapter(adapter);

        viewModel.load();
        viewModel.getItems().observe(this, new Observer<List<MainItem>>() {
            @Override
            public void onChanged(List<MainItem> mainItems) {
                adapter.setItems(new ArrayList<>(mainItems));
            }
        });
    }
}
