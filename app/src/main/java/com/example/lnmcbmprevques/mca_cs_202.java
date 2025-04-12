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

public class mca_cs_202 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_202);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-202 2017",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20202%2FCS%20202%202017.pdf?alt=media&token=f0692116-e570-413c-ba69-19de584d33ac"));


        productList.add(new Product(1,
                "CS-202 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20202%2FCS%20202%202018.pdf?alt=media&token=2f20d6d7-5058-4df0-864d-4dcc33e0ccd5"));


        productList.add(new Product(1,
                "CS-202 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20202%2FCS%20202%202019.pdf?alt=media&token=43976147-5c9a-4c50-9ab4-3cb98b6d42d3"));


        productList.add(new Product(1,
                "CS-202 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20202%2FCS%20202%202020.pdf?alt=media&token=25206f03-9200-4efb-90ff-6856beff3ad3"));


        productList.add(new Product(1,
                "CS-202 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20202%2FCS%20202%202022.pdf?alt=media&token=1610e470-714f-4acd-ad22-75072388e5df"));

        productList.add(new Product(1,
                "CS-202 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20202%2FCS%20202%202023.pdf?alt=media&token=8ffa949d-2c1b-416d-8bd4-dbfd3c8cabe4"));



        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}