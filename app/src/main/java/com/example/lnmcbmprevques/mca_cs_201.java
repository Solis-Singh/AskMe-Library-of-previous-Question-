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

public class mca_cs_201 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_201);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-201 2017",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20201%2FCS%20201%202017.pdf?alt=media&token=6af95d86-216c-4d32-95ca-34b334344f9d"));

        productList.add(new Product(1,
                "CS-201 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20201%2FCS%20201%202018.pdf?alt=media&token=4cccbb1c-8305-46e0-abcf-00574b452b30"));

        productList.add(new Product(1,
                "CS-201 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20201%2FCS%20201%202019.pdf?alt=media&token=4cea3525-764b-4713-989c-c15a57a59b82"));

        productList.add(new Product(1,
                "CS-201 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20201%2FCS%20201%202020.pdf?alt=media&token=ac41f35c-38d4-4f90-89e1-367073a72da3"));

        productList.add(new Product(1,
                "CS-201 2021",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20201%2FCS%20201%202021.pdf?alt=media&token=20282bec-b3b1-4537-a4e0-e74eb5679fbf"));

        productList.add(new Product(1,
                "CS-201 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20201%2FCS%20201%202022.pdf?alt=media&token=6137a967-4f57-4759-9142-fc7bff899518"));

        productList.add(new Product(1,
                "CS-201 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%202nd%20semester%2Fcs%20201%2FCS%20201%202023.pdf?alt=media&token=166609e6-9768-4b53-a449-63fba82513b2"));


        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}