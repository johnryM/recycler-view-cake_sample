package com.example.skeeno.testapp;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //dont redraw the frag when you rotate screen
    if(savedInstanceState == null) {
      //set up the fragment manager which deals with finding frags / creating transactions to add/replace frags
      final FragmentManager fragmentManager = getSupportFragmentManager();

      //check first if this fragment exists already
      RecyclerViewFragment frag = (RecyclerViewFragment) fragmentManager.findFragmentById(R.id.recycler_view_container);

      // only create the frag if it doesn't exist to stop unnecessary calls to create fragments
      if (frag == null) {
        frag = RecyclerViewFragment.newInstance();
        fragmentManager.beginTransaction()
                .add(R.id.activity_main, frag)
                .commit();
      }
    }

  }
}

