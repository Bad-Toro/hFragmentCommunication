package com.mac.training.fragmentcommunication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements iComm{

    Fragment f1;
    SecondFragment f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new FirstFragment();
        f2 = new SecondFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fT = fm.beginTransaction();
        fT.add(R.id.forFirst,f1);
        fT.add(R.id.forSecond,f2);
        fT.commit();
    }

    @Override
    public void setTextTo(String s) {

        f2.setIt(s);

    }
}
