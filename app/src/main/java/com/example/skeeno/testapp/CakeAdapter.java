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
 *
 */

public class CakeAdapter extends RecyclerView.Adapter<CakeAdapter.CakeViewHolder> {

    private ArrayList<Cake> mCakeList;

    public CakeAdapter (ArrayList<Cake> cakeList) {
        mCakeList = cakeList;
    }

    @Override
    public CakeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //creates the view used for each item in your recycler view - takes in your layout for a list item
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cake_list_row, parent, false);
        return new CakeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CakeViewHolder holder, int position) {
        // binds each element in your data arraylist into holder that makes up one item in the RecView list
        CakeViewHolder cakeHolder = holder;
        Cake cake = mCakeList.get(position);
        cakeHolder.bindCakeToHolder(cake);
    }

    @Override
    //helper method if you want to do something to a particular item on the recycler view
    public int getItemCount() {
        return mCakeList.size();
    }

    //The viewholder holds the data of one item in the recyclerview
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
