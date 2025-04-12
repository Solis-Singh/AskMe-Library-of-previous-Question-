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

public class mca_cs_304 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_304);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-304 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20304%2FCS%20304%202018.pdf?alt=media&token=029fc2c1-9e80-4c5d-8f43-7bc6350bdb34"));

        productList.add(new Product(1,
                "CS-304 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20304%2FCS%20304%202019.pdf?alt=media&token=ed2dc7fe-348a-4f7b-ab22-17a43c30d93a"));

        productList.add(new Product(1,
                "CS-304 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20304%2FCS%20304%202020.pdf?alt=media&token=22dde538-fc4d-4f75-8c9d-02b66f21a87b"));

        productList.add(new Product(1,
                "CS-304 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20304%2FCS%20304%202022.pdf?alt=media&token=4888ecae-32fb-4055-83cb-6ab465df65cd"));

        productList.add(new Product(1,
                "CS-304 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20304%2FCS%20304%202023.pdf?alt=media&token=80286c3e-7b48-47c7-9f41-c5c0fe392415"));


        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}