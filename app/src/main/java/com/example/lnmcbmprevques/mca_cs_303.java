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

public class mca_cs_303 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_303);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-303 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20303%2FCS%20303%202018.pdf?alt=media&token=96fa3257-5229-47e5-8655-64f3bcf78302"));

        productList.add(new Product(1,
                "CS-303 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20303%2FCS%20303%202019.pdf?alt=media&token=234f245d-1b7c-4457-b08c-a20a5e848d89"));

        productList.add(new Product(1,
                "CS-303 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20303%2FCS%20303%202020.pdf?alt=media&token=7b522cc8-c442-465d-808a-a3ac1c8431d8"));

        productList.add(new Product(1,
                "CS-303 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20303%2FCS%20303%202022.pdf?alt=media&token=1445cee3-2353-462a-a989-4f46f1e7daca"));

        productList.add(new Product(1,
                "CS-303 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%203rd%20semester%2FCS%20303%2FCS%20303%202023.pdf?alt=media&token=150b0dad-9c12-44c3-abdf-7679e7793831"));



        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}