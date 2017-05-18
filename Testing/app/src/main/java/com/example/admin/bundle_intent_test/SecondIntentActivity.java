package com.example.admin.bundle_intent_test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.admin.R;

/**
 * Created by admin on 14-11-2016.
 */

public class SecondIntentActivity extends AppCompatActivity {

    private UserResponseModel userResponseModel;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_first);

        userResponseModel = (UserResponseModel) getIntent().getSerializableExtra("UserResponseModel");

        userResponseModel = (UserResponseModel) getIntent().getExtras().getSerializable("UserResponseModel");

        (findViewById(R.id.txtSecondActivity)).setVisibility(View.VISIBLE);
    }


    public void click(View view) {

    }

}
