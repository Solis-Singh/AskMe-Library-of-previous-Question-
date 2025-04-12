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

public class mca_cs_504 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_504);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-504 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%205th%20semester%2FCS%20504%2FCS%20504%202018.pdf?alt=media&token=2bc30f03-2ec4-467f-b32c-2958e9e82d0c"));

        productList.add(new Product(1,
                "CS-504 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%205th%20semester%2FCS%20504%2FCS%20504%202020.pdf?alt=media&token=6b05acfc-6011-4816-9e1a-e0da019ae5d3"));

        productList.add(new Product(1,
                "CS-504 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%205th%20semester%2FCS%20504%2FCS%20504%202023.pdf?alt=media&token=f44e5d59-df0b-4689-b432-bdec1accde2d"));


        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}