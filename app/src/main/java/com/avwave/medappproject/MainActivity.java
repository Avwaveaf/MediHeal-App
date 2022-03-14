package com.avwave.medappproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Button btnCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        btnCall = (Button) findViewById(R.id.button15);
        final ImageView imgMenuOption1 = findViewById(R.id.imageViewfifth);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityCall();
            }
        });
        imgMenuOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Menu 1 Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void openActivityCall(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}