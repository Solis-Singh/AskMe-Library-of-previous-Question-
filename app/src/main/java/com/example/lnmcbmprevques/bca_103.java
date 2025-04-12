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

public class bca_103 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_103);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "BCA-103 2019",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%201st%20semester%2FBC%20103%2FBC%20103%202019.pdf?alt=media&token=475c4d06-7a0d-4214-a011-b10584832a6e"));

        productList.add(new Product(1,
                "BCA-103 2020",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%201st%20semester%2FBC%20103%2FBC%20103%202020.pdf?alt=media&token=48a938df-21d7-462d-a81d-e7a9f946dc95"));

        productList.add(new Product(1,
                "BCA-103 2021",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%201st%20semester%2FBC%20103%2FBC%20103%202021.pdf?alt=media&token=144b37ad-8dc5-47ed-918d-ef761c5a0fda"));

        productList.add(new Product(1,
                "BCA-103 2022",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%201st%20semester%2FBC%20103%2FBC%20103%202022.pdf?alt=media&token=bffebdd4-39e8-471c-b6f1-e22ffe6654e9"));


        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}