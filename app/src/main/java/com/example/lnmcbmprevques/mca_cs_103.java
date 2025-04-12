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

public class mca_cs_103 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_103);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-103 2017",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20103%2FCS%20103%202017.pdf?alt=media&token=861d6532-bb34-48b0-b5ba-f38d1cbb2f3a"));

        productList.add(new Product(1,
                "CS-103 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20103%2FCS%20103%202018.pdf?alt=media&token=790528c8-e1ec-416b-b23a-f82930212c87"));

        productList.add(new Product(1,
                "CS-103 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20103%2FCS%20103%202019.pdf?alt=media&token=49b6df4f-2704-49f7-89bd-4927eeaab2d8"));

        productList.add(new Product(1,
                "CS-103 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20103%2FCS%20103%202020.pdf?alt=media&token=b42078ea-7eb5-4c2c-96b9-28619c9f79df"));

        productList.add(new Product(1,
                "CS-103 2021",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20103%2FCS%20103%202021.pdf?alt=media&token=cb35e603-9219-4c9d-a93c-d738a72b6cf8"));

        productList.add(new Product(1,
                "CS-103 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20103%2FCS%20103%202022.pdf?alt=media&token=5405b95f-55db-4877-9e53-14ec5dfb6d07"));

        productList.add(new Product(1,
                "CS-103 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20103%2FCS%20103%202023.pdf?alt=media&token=74b517c9-bc10-4144-9959-78acad33a5ab"));



        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}