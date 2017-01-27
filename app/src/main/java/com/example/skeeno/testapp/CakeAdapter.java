package com.example.skeeno.testapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.skeeno.testapp.Model.Cake;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by skeeno on 27/01/2017.
 */

public class CakeAdapter extends RecyclerView.Adapter<CakeAdapter.CakeViewHolder> {

    private ArrayList<Cake> mCakeList;

    public CakeAdapter (ArrayList<Cake> cakeList) {
        mCakeList = cakeList;
    }

    @Override
    public CakeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cake_list_row, parent, false);
        return new CakeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CakeViewHolder holder, int position) {
        CakeViewHolder cakeHolder = holder;
        Cake cake = mCakeList.get(position);
        cakeHolder.bindCakeToHolder(cake);
    }

    @Override
    public int getItemCount() {
        return mCakeList.size();
    }

    public class CakeViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.name) TextView name;
        @BindView(R.id.price) TextView price;
        @BindView(R.id.num_of_slices) TextView numOfSlices;

        public CakeViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        public void bindCakeToHolder(Cake cake) {
            name.setText(cake.getName());
            price.setText(String.valueOf(cake.getPrice()));
            numOfSlices.setText(String.valueOf(cake.getNumOfSlices()));
        }

    }
}
