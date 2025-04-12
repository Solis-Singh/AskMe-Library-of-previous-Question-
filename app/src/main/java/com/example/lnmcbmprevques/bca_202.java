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

public class bca_202 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_202);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "BCA-202 2020",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20202%2FBC%20202%202020.pdf?alt=media&token=7f8a1519-d428-4568-a491-b3817972566f"));

        productList.add(new Product(1,
                "BCA-202 2021",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20202%2FBC%20202%202021.pdf?alt=media&token=b10cfe97-e483-439d-8d7c-3902998f2bef"));

        productList.add(new Product(1,
                "BCA-202 2022",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20202%2FBC%20202%202022.pdf?alt=media&token=6348a255-dd9b-49b1-92c3-8c9be14f279a"));

        productList.add(new Product(1,
                "BCA-202 2023",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%202nd%20semester%2FBC%20202%2FBC%20202%202023.pdf?alt=media&token=54102d06-c8d1-4f51-90ad-ac0b59585db4"));


        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}