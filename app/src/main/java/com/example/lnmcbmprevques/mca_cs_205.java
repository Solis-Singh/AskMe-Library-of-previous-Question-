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

public class mca_cs_205 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_205);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-205 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20205%2FCS%20205%202018.pdf?alt=media&token=604edbca-aaa0-41ee-95b6-ca72a51f6db6"));

        productList.add(new Product(1,
                "CS-205 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20205%2FCS%20205%202019.pdf?alt=media&token=f96d337a-261a-40a3-a1d0-3644f37e29fb"));

        productList.add(new Product(1,
                "CS-205 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20205%2FCS%20205%202020.pdf?alt=media&token=7de12614-d2b8-4bc2-a824-107ee6208fac"));

        productList.add(new Product(1,
                "CS-205 2021",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20205%2FCS%20205%202021.pdf?alt=media&token=17b69547-63b8-4377-98dc-b461812ee9c2"));

        productList.add(new Product(1,
                "CS-205 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20205%2FCS%20205%202022.pdf?alt=media&token=1983443a-659f-4cf4-9999-ce4f6cafedee"));

        productList.add(new Product(1,
                "CS-205 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20205%2FCS%20205%202023.pdf?alt=media&token=6e23b674-1790-433b-8ab0-d3e0f2c718aa"));



        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}