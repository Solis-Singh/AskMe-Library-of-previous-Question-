package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class bca1sem extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca1sem);
        NeumorphCardView neumorphCardView1 = findViewById(R.id.bca101);
        NeumorphCardView neumorphCardView2 = findViewById(R.id.bca102);
        NeumorphCardView neumorphCardView3 = findViewById(R.id.bca103);
        NeumorphCardView neumorphCardView4 = findViewById(R.id.bca104);


        neumorphCardView1.setOnClickListener(this);
        neumorphCardView2.setOnClickListener(this);
        neumorphCardView3.setOnClickListener(this);
        neumorphCardView4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bca101:
                Intent intent = new Intent(bca1sem.this, bca_101.class);
                startActivity(intent);
                break;
            case R.id.bca102:
                intent = new Intent(bca1sem.this, bca_102.class);
                startActivity(intent);
                break;
            case R.id.bca103:
                intent = new Intent(bca1sem.this, bca_103.class);
                startActivity(intent);
                break;
            case R.id.bca104:
                intent = new Intent(bca1sem.this, bca_104.class);
                startActivity(intent);
                break;
        }
    }

}