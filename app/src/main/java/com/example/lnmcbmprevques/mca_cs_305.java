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

public class mca_cs_305 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_305);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-305 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20305%2FCS%20305%202018.pdf?alt=media&token=b95ac585-fecd-4217-8bf7-644bc08907ad"));

        productList.add(new Product(1,
                "CS-305 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20305%2FCS%20305%202019.pdf?alt=media&token=f37f4018-eaea-4e38-84d0-b606eedcf93d"));

        productList.add(new Product(1,
                "CS-305 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20305%2FCS%20305%202020.pdf?alt=media&token=134d2097-601c-4f14-a4f8-c07081e2ef68"));

        productList.add(new Product(1,
                "CS-305 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20305%2FCS%20305%202022.pdf?alt=media&token=503a7c22-84a9-4297-bc7f-4574910e757d"));


        productList.add(new Product(1,
                "CS-305 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20305%2FCS%20305%202023.pdf?alt=media&token=cc43bfed-8138-46bf-823e-9f9e6c101d52"));


        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}