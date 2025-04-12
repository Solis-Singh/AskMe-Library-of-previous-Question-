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

public class bca_201 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_201);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "BCA-201 2020",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20201%2FBC%20201%202020.pdf?alt=media&token=33471666-18c6-45de-8d6e-abea3f5e2961"));

        productList.add(new Product(1,
                "BCA-201 2021",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20201%2FBC%20201%202021.pdf?alt=media&token=824aa031-a6a3-4bfa-b72b-e3dd3d017c74"));

        productList.add(new Product(1,
                "BCA-201 2022",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20201%2FBC%20201%202022.pdf?alt=media&token=015ebd21-300a-4390-b3bb-f36d79b067a2"));

        productList.add(new Product(1,
                "BCA-201 2023",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20201%2FBC%20201%202023.pdf?alt=media&token=bf0b4acc-b873-4ea2-af78-51ccacf8292e"));


        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}