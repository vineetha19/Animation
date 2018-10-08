package com.example.admin.animation;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import hari.allagi.Allagi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> menuList = new ArrayList<>();
        ArrayList<Integer> imageList = new ArrayList<>();
        ArrayList<Fragment> fragmentList = new ArrayList<>();

        menuList.add("UPCOMING");
        menuList.add("EVENTS");
        menuList.add("GUEST LECTURES $ CROSSFIRE");
        menuList.add("SCHEDULE");
        menuList.add("PROFILE");
        menuList.add("MAP");
        menuList.add("VISUALIZE");
        menuList.add("HUMAN LIBRARY");

        imageList.add(R.drawable.upcoming);
        imageList.add(R.drawable.events);
        imageList.add(R.drawable.guest_lectures);
        imageList.add(R.drawable.schedule);
        imageList.add(R.drawable.profile);
        imageList.add(R.drawable.map);
        imageList.add(R.drawable.visualise);
        imageList.add(R.drawable.human_library);

        fragmentList.add(SampleFragment.newInstance("Upcoming fragment"));
        fragmentList.add(SampleFragment.newInstance("Events fragment"));
        fragmentList.add(SampleFragment.newInstance("Guest lectures fragment"));
        fragmentList.add(SampleFragment.newInstance("Schedule fragment"));
        fragmentList.add(SampleFragment.newInstance("Profile fragment"));
        fragmentList.add(SampleFragment.newInstance("Map fragment"));
        fragmentList.add(SampleFragment.newInstance("Visualize fragment"));
        fragmentList.add(SampleFragment.newInstance("Human library fragment"));


        Allagi allagi = Allagi.initialize(MainActivity.this, menuList, imageList, fragmentList);
        allagi.start();




    }
}
