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

public class mca_cs_204 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_204);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-204 2017",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20204%2FCS%20204%202017.pdf?alt=media&token=e88ee2d7-ad45-45d7-af30-96711154d9a8"));

        productList.add(new Product(1,
                "CS-204 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20204%2FCS%20204%202018.pdf?alt=media&token=d0dc6d83-68ab-4821-afab-af0d84d387e4"));

        productList.add(new Product(1,
                "CS-204 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20204%2FCS%20204%202019.pdf?alt=media&token=c7c888db-69de-45e9-ac1c-4b17d4b6bfab"));

        productList.add(new Product(1,
                "CS-204 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20204%2FCS%20204%202020.pdf?alt=media&token=ebe9e4a0-d01b-404c-a11b-dd80d30f4258"));

        productList.add(new Product(1,
                "CS-204 2021",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20204%2FCS%20204%202021.pdf?alt=media&token=1cc1f310-2f85-4859-9cd8-65fa56f8263f"));

        productList.add(new Product(1,
                "CS-204 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20204%2FCS%20204%202022.pdf?alt=media&token=f5389e9c-f1db-43e7-ae5e-0bcc096ba2cf"));

        productList.add(new Product(1,
                "CS-204 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20204%2FCS%20204%202023.pdf?alt=media&token=dba1b9e9-4268-4404-a54d-f2b05e5063e7"));



        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}