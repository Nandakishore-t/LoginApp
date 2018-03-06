package com.example.srikanthreddykarka.loginapp;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.srikanthreddykarka.loginapp.databinding.ActivityMainBinding;
import com.example.srikanthreddykarka.loginapp.viewmodel.userModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding  activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        userModel usermodel = new userModel();
        activityMainBinding.setUser(usermodel);
        activityMainBinding.setActivity(this);

    }
}
