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

public class mca_cs_302 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_302);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-302 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20302%2FCS%20302%202018.pdf?alt=media&token=eed4aef5-32c3-40a3-b5bf-9b0953e9f40c"));

        productList.add(new Product(1,
                "CS-302 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20302%2FCS%20302%202019.pdf?alt=media&token=86e7b2ed-1d6f-4d89-9777-8c33d941b3f7"));

        productList.add(new Product(1,
                "CS-302 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20302%2FCS%20302%202020.pdf?alt=media&token=fc1da465-18b8-43f2-a541-5fa1c028473b"));

        productList.add(new Product(1,
                "CS-302 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20302%2FCS%20302%202022.pdf?alt=media&token=5688d146-15b2-42a3-b37e-ef87622c0c5c"));

        productList.add(new Product(1,
                "CS-302 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20302%2FCS%20302%202023.pdf?alt=media&token=f0bd464d-f1fb-4491-9181-5466efd7002b"));



        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}