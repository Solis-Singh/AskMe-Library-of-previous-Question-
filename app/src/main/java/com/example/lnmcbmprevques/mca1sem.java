package com.example.lnmcbmprevques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class mca1sem extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca1sem);
        NeumorphCardView neumorphCardView1 = findViewById(R.id.cs101);
        NeumorphCardView neumorphCardView2 = findViewById(R.id.cs102);
        NeumorphCardView neumorphCardView3 = findViewById(R.id.cs103);
        NeumorphCardView neumorphCardView4 = findViewById(R.id.cs104);
        NeumorphCardView neumorphCardView5 = findViewById(R.id.cs105);



        neumorphCardView1.setOnClickListener(this);
        neumorphCardView2.setOnClickListener(this);
        neumorphCardView3.setOnClickListener(this);
        neumorphCardView4.setOnClickListener(this);
        neumorphCardView5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.cs101:
                Intent intent = new Intent(mca1sem.this, mca_cs_101.class);
                startActivity(intent);
                break;
            case R.id.cs102:
                intent = new Intent(mca1sem.this, mca_cs_102.class);
                startActivity(intent);
                break;
            case R.id.cs103:
                intent = new Intent(mca1sem.this, mca_cs_103.class);
                startActivity(intent);
                break;
            case R.id.cs104:
                intent = new Intent(mca1sem.this, mca_cs_104.class);
                startActivity(intent);
                break;
            case R.id.cs105:
                intent = new Intent(mca1sem.this, mca_cs_105.class);
                startActivity(intent);
                break;
        }
    }

}