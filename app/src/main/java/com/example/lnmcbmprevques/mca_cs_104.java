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

public class mca_cs_104 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_104);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-104 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20104%2FCS%20104%202018.pdf?alt=media&token=671e1cae-44b7-400f-8595-907bc3d284c6"));

        productList.add(new Product(1,
                "CS-104 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20104%2FCS%20104%202019.pdf?alt=media&token=6564c55a-fdbc-4e1c-bbef-04a7725cd183"));

        productList.add(new Product(1,
                "CS-104 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20104%2FCS%20104%202020.pdf?alt=media&token=ab1a6e04-653d-4861-b0b6-e71be63841af"));

        productList.add(new Product(1,
                "CS-104 2021",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20104%2FCS%20104%202021.pdf?alt=media&token=f0156b1a-4679-4cba-bf06-aa842c6de7b5"));

        productList.add(new Product(1,
                "CS-104 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20104%2FCS%20104%202022.pdf?alt=media&token=f95b22fc-dfad-404f-8c6e-a2ca07ca9931"));

        productList.add(new Product(1,
                "CS-104 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20104%2FCS%20104%202023.pdf?alt=media&token=1474f22a-6a95-4300-a1e6-7d2348b5caf0"));




        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}