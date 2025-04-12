package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class bca extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca);

        NeumorphCardView cardView1 = findViewById(R.id.bcasem1);
        NeumorphCardView cardView2 = findViewById(R.id.bcasem2);
        NeumorphCardView cardView3 = findViewById(R.id.bcasem3);
        NeumorphCardView cardView4 = findViewById(R.id.bcasem4);
        NeumorphCardView cardView5 = findViewById(R.id.bcasem5);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bcasem1:
                Intent intent = new Intent(bca.this, bca1sem.class);
                startActivity(intent);
                break;
            case R.id.bcasem2:
                intent = new Intent(bca.this, bca2sem.class);
                startActivity(intent);
                break;
            case R.id.bcasem3:
                intent = new Intent(bca.this, bca3sem.class);
                startActivity(intent);
                break;
            case R.id.bcasem4:
                intent = new Intent(bca.this, bca4sem.class);
                startActivity(intent);
                break;
            case R.id.bcasem5:
                intent = new Intent(bca.this, bca5sem.class);
                startActivity(intent);
                break;
        }
    }

}