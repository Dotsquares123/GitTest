package com.example.admin.bundle_intent_test;


import android.content.ContentResolver;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.R;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * Created by admin on 14-11-2016.
 */

public class FirstIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_intent);

    }


    public void click(View view) {
        EditText etxt = (EditText) findViewById(R.id.etxt);
        int number = Integer.parseInt(etxt.getText().toString());
        if(number == 0) return;

        int revNumber = 0;
        do {
            revNumber = revNumber*10 + number % 10;
            number = (number - number % 10)/10;
        } while(number != 0);

        TextView txtRev = (TextView) findViewById(R.id.txtRev);
        txtRev.setText(""+revNumber);
        Log.e("ReverseNumber", ""+revNumber);
    }


    public void iterateHashMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        Iterator it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();

        }
    }
}
