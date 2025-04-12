package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class mca3sem extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca3sem);

        NeumorphCardView cardView1 = findViewById(R.id.cs301);
        NeumorphCardView cardView2 = findViewById(R.id.cs302);
        NeumorphCardView cardView3 = findViewById(R.id.cs303);
        NeumorphCardView cardView4 = findViewById(R.id.cs304);
        NeumorphCardView cardView5 = findViewById(R.id.cs305);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.cs301:
                Intent intent = new Intent(mca3sem.this, mca_cs_301.class);
                startActivity(intent);
                break;
            case R.id.cs302:
                intent = new Intent(mca3sem.this, mca_cs_302.class);
                startActivity(intent);
                break;
            case R.id.cs303:
                intent = new Intent(mca3sem.this, mca_cs_303.class);
                startActivity(intent);
                break;
            case R.id.cs304:
                intent = new Intent(mca3sem.this, mca_cs_304.class);
                startActivity(intent);
                break;
            case R.id.cs305:
                intent = new Intent(mca3sem.this, mca_cs_305.class);
                startActivity(intent);
                break;

        }
    }

}