package com.example.lnmcbmprevques;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class mca_cs_502 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_502);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-502 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%205th%20semester%2FCS%20502%2FCS%20502%202018.pdf?alt=media&token=04985ce6-258f-4442-a735-f89b1451509e"));

        productList.add(new Product(1,
                "CS-502 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%205th%20semester%2FCS%20502%2FCS%20502%202020.pdf?alt=media&token=a549a6ee-81ad-4078-9f39-d9cc38458f52"));

        productList.add(new Product(1,
                "CS-502 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%205th%20semester%2FCS%20502%2FCS%20502%202023.pdf?alt=media&token=9049ac23-0e14-4f01-8b0e-ac316fd0e0ec"));

        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}