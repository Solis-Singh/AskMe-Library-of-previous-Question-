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

public class bca_104 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_104);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "BCA-104 2019",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%201st%20semester%2FBC%20104%2FBC%20104%202019.pdf?alt=media&token=ab0a0a78-cff5-4544-ac4e-13a0a767d349"));

        productList.add(new Product(1,
                "BCA-104 2020",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%201st%20semester%2FBC%20104%2FBC%20104%202020.pdf?alt=media&token=b28b9f53-2c35-4f6d-8af8-c72f97ec3c34"));

        productList.add(new Product(1,
                "BCA-104 2021",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%201st%20semester%2FBC%20104%2FBC%20104%202021.pdf?alt=media&token=0bb211a0-3a0a-4188-b1c9-02a7262f5075"));

        productList.add(new Product(1,
                "BCA-104 2022",
                R.drawable.courselogo2,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/bca%2Fbca%201st%20semester%2FBC%20104%2FBC%20104%202022.pdf?alt=media&token=ddb62d92-60fb-496e-bf5b-7c3d4136a1aa"));



        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}