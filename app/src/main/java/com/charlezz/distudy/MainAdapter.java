package com.charlezz.distudy;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.charlezz.distudy.databinding.MainItemBinding;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{


    ArrayList<MainItem> items;

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MainItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.main_item,
                null,
                false);
        return new ViewHolder(binding);
    }

    public void setItems(ArrayList<MainItem> items){
        this.items = items;
        notifyDataSetChanged();
    }


    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        holder.binding.setItem(items.get(position));
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private MainItemBinding binding;
        public ViewHolder(MainItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}
