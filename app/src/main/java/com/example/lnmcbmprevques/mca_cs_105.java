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

public class mca_cs_105 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_105);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-105 2016",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20105%2FCS%20105%202016.pdf?alt=media&token=32f73327-35a1-43d6-92ca-31875c7a1888"));

        productList.add(new Product(1,
                "CS-105 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20105%2FCS%20105%202018.pdf?alt=media&token=12ebde49-cb42-4e81-be5e-fb66c02a551f"));

        productList.add(new Product(1,
                "CS-105 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20105%2FCS%20105%202019.pdf?alt=media&token=60298270-a5da-40dd-8539-dc4b1ecf6fff"));

        productList.add(new Product(1,
                "CS-105 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20105%2FCS%20105%202020.pdf?alt=media&token=70bbf8b0-e079-4fa6-8bc3-f3df2d9e0dc1"));

        productList.add(new Product(1,
                "CS-105 2021",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20105%2FCS%20105%202021.pdf?alt=media&token=56278921-f45f-48f0-a27c-3dbef3f3a9b6"));

        productList.add(new Product(1,
                "CS-105 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20105%2FCS%20105%202022.pdf?alt=media&token=eb7b8bc3-6e52-4be9-a4a6-6cafe358abe5"));

        productList.add(new Product(1,
                "CS-105 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20105%2FCS%20105%202023.pdf?alt=media&token=03de4379-e7c6-430d-b5fe-4cbe9994dcda"));


        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}