package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class mca5sem extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca5sem);

        NeumorphCardView cardView1 = findViewById(R.id.cs501);
        NeumorphCardView cardView2 = findViewById(R.id.cs502);
        NeumorphCardView cardView3 = findViewById(R.id.cs503);
        NeumorphCardView cardView4 = findViewById(R.id.cs504);
        NeumorphCardView cardView5 = findViewById(R.id.cs505);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.cs501:
                Intent intent = new Intent(mca5sem.this, mca_cs_501.class);
                startActivity(intent);
                break;
            case R.id.cs502:
                intent = new Intent(mca5sem.this, mca_cs_502.class);
                startActivity(intent);
                break;
            case R.id.cs503:
                intent = new Intent(mca5sem.this, mca_cs_503.class);
                startActivity(intent);
                break;
            case R.id.cs504:
                intent = new Intent(mca5sem.this, mca_cs_504.class);
                startActivity(intent);
                break;
            case R.id.cs505:
                intent = new Intent(mca5sem.this, mca_cs_505.class);
                startActivity(intent);
                break;

        }
    }

}