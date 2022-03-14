package com.avwave.medappproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.Objects;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Objects.requireNonNull(getSupportActionBar()).hide();

        Button btnCall = findViewById(R.id.btnRdrCall);
        btnCall.setOnClickListener(view -> redirectPhoneCall());
        ImageView imgBack = findViewById(R.id.imageView2);
        imgBack.setOnClickListener(view -> backMainActivity());

    }
    public void backMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void redirectPhoneCall(){
        String a1 = "911";
        Intent intent1 = new Intent();
        intent1.setAction(Intent.ACTION_DIAL);
        intent1.setData( Uri.parse("tel:" + a1));
        startActivity(intent1);

    }
}