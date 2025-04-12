package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class mca extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca);

        NeumorphCardView cardView1 = findViewById(R.id.mcasem1);
        NeumorphCardView cardView2 = findViewById(R.id.mcasem2);
        NeumorphCardView cardView3 = findViewById(R.id.mcasem3);
        NeumorphCardView cardView4 = findViewById(R.id.mcasem4);
        NeumorphCardView cardView5 = findViewById(R.id.mcasem5);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.mcasem1:
                Intent intent = new Intent(mca.this, mca1sem.class);
                startActivity(intent);
                break;
            case R.id.mcasem2:
                intent = new Intent(mca.this, mca2sem.class);
                startActivity(intent);
                break;
            case R.id.mcasem3:
                intent = new Intent(mca.this, mca3sem.class);
                startActivity(intent);
                break;
            case R.id.mcasem4:
                intent = new Intent(mca.this, mca4sem.class);
                startActivity(intent);
                break;
            case R.id.mcasem5:
                intent = new Intent(mca.this, mca5sem.class);
                startActivity(intent);
                break;
        }
    }

}