package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class bca5sem extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca5sem);
        NeumorphCardView neumorphCardView1 = findViewById(R.id.bca501);
        NeumorphCardView neumorphCardView2 = findViewById(R.id.bca502);
        NeumorphCardView neumorphCardView3 = findViewById(R.id.bca503);
        NeumorphCardView neumorphCardView4 = findViewById(R.id.bca504);


        neumorphCardView1.setOnClickListener(this);
        neumorphCardView2.setOnClickListener(this);
        neumorphCardView3.setOnClickListener(this);
        neumorphCardView4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bca501:
                Intent intent = new Intent(bca5sem.this, bca_501.class);
                startActivity(intent);
                break;
            case R.id.bca502:
                intent = new Intent(bca5sem.this, bca_502.class);
                startActivity(intent);
                break;
            case R.id.bca503:
                intent = new Intent(bca5sem.this, bca_503.class);
                startActivity(intent);
                break;
            case R.id.bca504:
                intent = new Intent(bca5sem.this, bca_504.class);
                startActivity(intent);
                break;
        }
    }

}