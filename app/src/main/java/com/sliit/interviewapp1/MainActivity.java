package com.sliit.interviewapp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.sliit.interviewapp1.Task1.Task1Fragment;
import com.sliit.interviewapp1.Task2.Task2Fragment;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment=new HomeFragment();
    Task1Fragment task1Fragment=new Task1Fragment();
    Task2Fragment task2Frgament=new Task2Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
        getSupportActionBar().setTitle("Home");

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();


        if(id== R.id.page_1) {
            getSupportActionBar().setTitle("Task1");
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, task1Fragment).commit();
            return true;
        }
        else if(id==R.id.page_2) {
            getSupportActionBar().setTitle("Task2");
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, task2Frgament).commit();
            return true;
        }
        else {
            getSupportActionBar().setTitle("Home");
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, homeFragment).commit();
            return true;
        }


    }
}