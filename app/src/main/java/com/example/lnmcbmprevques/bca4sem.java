package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class bca4sem extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca4sem);
        NeumorphCardView neumorphCardView1 = findViewById(R.id.bca401);
        NeumorphCardView neumorphCardView2 = findViewById(R.id.bca402);
        NeumorphCardView neumorphCardView3 = findViewById(R.id.bca403);
        NeumorphCardView neumorphCardView4 = findViewById(R.id.bca404);


        neumorphCardView1.setOnClickListener(this);
        neumorphCardView2.setOnClickListener(this);
        neumorphCardView3.setOnClickListener(this);
        neumorphCardView4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bca401:
                Intent intent = new Intent(bca4sem.this, bca_401.class);
                startActivity(intent);
                break;
            case R.id.bca402:
                intent = new Intent(bca4sem.this, bca_402.class);
                startActivity(intent);
                break;
            case R.id.bca403:
                intent = new Intent(bca4sem.this, bca_403.class);
                startActivity(intent);
                break;
            case R.id.bca404:
                intent = new Intent(bca4sem.this, bca_404.class);
                startActivity(intent);
                break;
        }
    }

}