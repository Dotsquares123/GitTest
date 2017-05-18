package com.example.admin.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Toast;

import com.example.admin.R;

/**
 * Created by admin on 08-11-2016.
 */

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }


    public void sendMail(View view) {
        String link_val = "www.google.com";
        String body = "<a href=\"" + link_val + "\">" + "Click here" + "</a>";

        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setType("plain/text");
        sendIntent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Test");
        sendIntent.putExtra(Intent.EXTRA_TEXT, Html.fromHtml(body));
        try {
            startActivity(sendIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(TestActivity.this, "Gmail is not installed.", Toast.LENGTH_LONG).show();
        }
    }
}
