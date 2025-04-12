package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class bca3sem extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca3sem);
        NeumorphCardView neumorphCardView1 = findViewById(R.id.bca301);
        NeumorphCardView neumorphCardView2 = findViewById(R.id.bca302);
        NeumorphCardView neumorphCardView3 = findViewById(R.id.bca303);
        NeumorphCardView neumorphCardView4 = findViewById(R.id.bca304);


        neumorphCardView1.setOnClickListener(this);
        neumorphCardView2.setOnClickListener(this);
        neumorphCardView3.setOnClickListener(this);
        neumorphCardView4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bca301:
                Intent intent = new Intent(bca3sem.this, bca_301.class);
                startActivity(intent);
                break;
            case R.id.bca302:
                intent = new Intent(bca3sem.this, bca_302.class);
                startActivity(intent);
                break;
            case R.id.bca303:
                intent = new Intent(bca3sem.this, bca_303.class);
                startActivity(intent);
                break;
            case R.id.bca304:
                intent = new Intent(bca3sem.this, bca_304.class);
                startActivity(intent);
                break;
        }
    }

}