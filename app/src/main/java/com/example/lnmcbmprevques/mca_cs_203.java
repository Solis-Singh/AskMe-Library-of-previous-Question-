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

public class mca_cs_203 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_203);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-203 2017",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20203%2FCS%20203%202017.pdf?alt=media&token=9e84e648-7dfc-43fd-adef-f1c1ec15e31c"));

        productList.add(new Product(1,
                "CS-203 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20203%2FCS%20203%202018.pdf?alt=media&token=c3454181-7e48-45c7-8d01-5d8ca0a6a38d"));

        productList.add(new Product(1,
                "CS-203 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20203%2FCS%20203%202019.pdf?alt=media&token=ae0e1f4d-93f4-41ae-87e4-206b56ef188b"));

        productList.add(new Product(1,
                "CS-203 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20203%2FCS%20203%202020.pdf?alt=media&token=670acb83-e26b-442a-a3b3-a8e35dd616f6"));

        productList.add(new Product(1,
                "CS-203 2021",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20203%2FCS%20203%202021.pdf?alt=media&token=39911765-3be8-4187-a0d0-2220cddb4a7c"));

        productList.add(new Product(1,
                "CS-203 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20203%2FCS%20203%202022.pdf?alt=media&token=099c206a-ef5c-4739-a936-146ecf4ba07d"));

        productList.add(new Product(1,
                "CS-203 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20203%2FCS%20203%202023.pdf?alt=media&token=b16c24dc-b40f-410e-bc04-f22ca4f0bf85"));



        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}