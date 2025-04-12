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

public class mca_cs_301 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_301);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-301 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20301%2FCS%20301%202018.pdf?alt=media&token=278d2204-8472-4229-a75b-ffaebe7325ab"));

        productList.add(new Product(1,
                "CS-301 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20301%2FCS%20301%202019.pdf?alt=media&token=c580ae47-43f5-4990-b37c-ed2a878a1647"));

        productList.add(new Product(1,
                "CS-301 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20301%2FCS%20301%202020.pdf?alt=media&token=83a99dda-ac90-4624-8e1b-2777dad92b35"));

        productList.add(new Product(1,
                "CS-301 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20301%2FCS%20301%202022.pdf?alt=media&token=2d29b343-19a1-47ea-88f2-8f6609c1a982"));

        productList.add(new Product(1,
                "CS-301 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20301%2FCS%20301%202023.pdf?alt=media&token=af68d8e2-9fbe-4079-8c98-b8bd4f95cbd4"));




        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}