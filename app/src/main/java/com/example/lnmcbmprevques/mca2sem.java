package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class mca2sem extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca2sem);
        NeumorphCardView cardView1 = findViewById(R.id.cs201);
        NeumorphCardView cardView2 = findViewById(R.id.cs202);
        NeumorphCardView cardView3 = findViewById(R.id.cs203);
        NeumorphCardView cardView4 = findViewById(R.id.cs204);
        NeumorphCardView cardView5 = findViewById(R.id.cs205);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.cs201:
                Intent intent = new Intent(mca2sem.this, mca_cs_201.class);
                startActivity(intent);
                break;
            case R.id.cs202:
                intent = new Intent(mca2sem.this, mca_cs_202.class);
                startActivity(intent);
                break;
            case R.id.cs203:
                intent = new Intent(mca2sem.this, mca_cs_203.class);
                startActivity(intent);
                break;
            case R.id.cs204:
                intent = new Intent(mca2sem.this, mca_cs_204.class);
                startActivity(intent);
                break;
            case R.id.cs205:
                intent = new Intent(mca2sem.this, mca_cs_205.class);
                startActivity(intent);
                break;
        }
    }

}