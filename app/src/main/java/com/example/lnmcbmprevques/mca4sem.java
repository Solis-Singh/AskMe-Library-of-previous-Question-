package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class mca4sem extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca4sem);

        NeumorphCardView cardView1 = findViewById(R.id.cs401);
        NeumorphCardView cardView2 = findViewById(R.id.cs402);
        NeumorphCardView cardView3 = findViewById(R.id.cs403);
        NeumorphCardView cardView4 = findViewById(R.id.cs404);
        NeumorphCardView cardView5 = findViewById(R.id.cs405);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.cs401:
                Intent intent = new Intent(mca4sem.this, mca_cs_401.class);
                startActivity(intent);
                break;
            case R.id.cs402:
                intent = new Intent(mca4sem.this, mca_cs_402.class);
                startActivity(intent);
                break;
            case R.id.cs403:
                intent = new Intent(mca4sem.this, mca_cs_403.class);
                startActivity(intent);
                break;
            case R.id.cs404:
                intent = new Intent(mca4sem.this, mca_cs_404.class);
                startActivity(intent);
                break;
            case R.id.cs405:
                intent = new Intent(mca4sem.this, mca_cs_405.class);
                startActivity(intent);
                break;

        }
    }

}