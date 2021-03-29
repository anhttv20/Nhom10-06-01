package com.example.nhom10_06_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Fragment_Frirst fragment;
    private FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        fragment=new Fragment_Frirst();
        transaction.add(R.id.frame,fragment);
        transaction.commit();
    }
}
