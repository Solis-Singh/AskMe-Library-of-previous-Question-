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

public class bca_203 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_203);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "BCA-203 2020",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20203%2FBC%20203%202020.pdf?alt=media&token=a08820ad-2eea-47f3-83a5-4ff81229b29d"));

        productList.add(new Product(1,
                "BCA-203 2021",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20203%2FBC%20203%202021.pdf?alt=media&token=6fc17f53-3ed6-41dd-a3aa-ec241a204397"));

        productList.add(new Product(1,
                "BCA-203 2022",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20203%2FBC%20203%202022.pdf?alt=media&token=f47ad683-1493-41ce-beb1-6e23c038c4dd"));

        productList.add(new Product(1,
                "BCA-203 2023",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20203%2FBC%20203%202023.pdf?alt=media&token=113fff20-e49f-4c38-91b6-99a2f1411d00"));



        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}