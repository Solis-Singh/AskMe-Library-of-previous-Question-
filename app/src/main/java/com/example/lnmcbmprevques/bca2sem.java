package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class bca2sem extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca2sem);
        NeumorphCardView neumorphCardView1 = findViewById(R.id.bca201);
        NeumorphCardView neumorphCardView2 = findViewById(R.id.bca202);
        NeumorphCardView neumorphCardView3 = findViewById(R.id.bca203);
        NeumorphCardView neumorphCardView4 = findViewById(R.id.bca204);


        neumorphCardView1.setOnClickListener(this);
        neumorphCardView2.setOnClickListener(this);
        neumorphCardView3.setOnClickListener(this);
        neumorphCardView4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bca201:
                Intent intent = new Intent(bca2sem.this, bca_201.class);
                startActivity(intent);
                break;
            case R.id.bca202:
                intent = new Intent(bca2sem.this, bca_202.class);
                startActivity(intent);
                break;
            case R.id.bca203:
                intent = new Intent(bca2sem.this, bca_203.class);
                startActivity(intent);
                break;
            case R.id.bca204:
                intent = new Intent(bca2sem.this, bca_204.class);
                startActivity(intent);
                break;
        }
    }

}