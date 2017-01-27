package com.example.skeeno.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.skeeno.testapp.Model.Cake;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ArrayList <Cake> mCakeList;
    private CakeAdapter mCakeAdapter;

    @BindView(R.id.recycler_view) RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        generateCakes();

        //this is the only code you need set up the recycler view

        //optimisation - set to true if you're going to frequently add/remove items in the list
        // so width/height of the recyclerview doesn't change which can affect the size of other views
        recyclerView.setHasFixedSize(true);

        //sets how to the recyclerview should position its items - LinearLayout makes it look like a normal list
        // that can be vertical/horizontal
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        //instantiate and set the the adapter which converts the data you want listed into something the RecView can render
        mCakeAdapter = new CakeAdapter(mCakeList);
        recyclerView.setAdapter(mCakeAdapter);
    }


    private void generateCakes() {
        mCakeList = new ArrayList<>();
        mCakeList.add(new Cake("Cheesecake", 5.99, 8));
        mCakeList.add(new Cake("Chocolate cake", 6.50, 8));
        mCakeList.add(new Cake("Wedding cake", 100, 20));
        mCakeList.add(new Cake("Toffee cake", 4.99, 6));
        mCakeList.add(new Cake("Birthday cake", 8.60, 12));
        mCakeList.add(new Cake("Latte cake", 9.99, 12));
        mCakeList.add(new Cake("Chocolate cake", 6.50, 10));
        mCakeList.add(new Cake("Wedding cake", 100, 14));
        mCakeList.add(new Cake("Toffee cake", 4.99, 8));
        mCakeList.add(new Cake("Cheesecake", 5.99, 16));
        mCakeList.add(new Cake("Chocolate cake", 6.50, 8));
    }


}


