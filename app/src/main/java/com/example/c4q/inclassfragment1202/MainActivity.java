package com.example.c4q.inclassfragment1202;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//first I will make a container in the activity main
        MainFragment mainFragment= new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        //Make and instance of the fragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //fragment transaction declares the fragments and helps add delete and etc.
        //we will replace the container with the fragment it self.
        //rootView needs to have access to things it is going to inflate

        fragmentTransaction.replace(R.id.frag_container, mainFragment);
        fragmentTransaction.commit();
    }
}
