package com.example.nhom10_06_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity
   implements View.OnClickListener {
    private FragmentManager manager;
    private Button btA,btB;
    private Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);
        btA=findViewById(R.id.btA);
        btB=findViewById(R.id.btB);
        manager=getSupportFragmentManager();

        btA.setOnClickListener(this);
        btB.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==btA){
            FragmentTransaction transaction=manager.beginTransaction();
            fragment=new FragmentA();
            transaction.add(R.id.frame,fragment);
            transaction.commit();
        }
        if(v==btB){
            FragmentTransaction transaction=manager.beginTransaction();
            fragment=new FragmentB();
            transaction.add(R.id.frame,fragment);
            transaction.commit();
        }
    }
}
