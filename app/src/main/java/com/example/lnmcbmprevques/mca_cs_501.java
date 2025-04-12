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

public class mca_cs_501 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_501);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-501 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%205th%20semester%2FCS%20501%2FCS%20501%202018.pdf?alt=media&token=71683496-c8ad-411c-a628-462c48b6802e"));

        productList.add(new Product(1,
                "CS-501 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%205th%20semester%2FCS%20501%2FCS%20501%202020.pdf?alt=media&token=4e63363f-bd26-462d-810f-cfca17ab515e"));

        productList.add(new Product(1,
                "CS-501 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%205th%20semester%2FCS%20501%2FCS%20501%202023.pdf?alt=media&token=794334a8-b4f5-4cb3-8271-7da4600d8e19"));




        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}