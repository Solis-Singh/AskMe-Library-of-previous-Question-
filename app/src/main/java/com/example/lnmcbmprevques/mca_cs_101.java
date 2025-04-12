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

public class mca_cs_101 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_101);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-101 2016",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20101%2FCS%20101%202016.pdf?alt=media&token=b98cd76b-0a45-4166-8417-7e0425e5d920"));

        productList.add(new Product(1,
                "CS-101 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20101%2FCS%20101%202018.pdf?alt=media&token=8a44d52b-9286-42d5-874e-33123b9794da"));

        productList.add(new Product(1,
                "CS-101 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20101%2FCS%20101%202019.pdf?alt=media&token=4b00fd31-2350-4789-8ae9-729bd8c662b2"));

        productList.add(new Product(1,
                "CS-101 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20101%2FCS%20101%202021.pdf?alt=media&token=6e88c01f-c54b-46c5-95bf-82f3e877a253"));

        productList.add(new Product(1,
                "CS-101 2021",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20101%2FCS%20101%202020.pdf?alt=media&token=a63549bb-dedb-4930-9ed6-257abf4e363d"));

        productList.add(new Product(1,
                "CS-101 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20101%2FCS%20101%202022.pdf?alt=media&token=5c982601-2ab0-4f3d-957a-ada34bbda2a8"));

        productList.add(new Product(1,
                "CS-101 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20101%2FCS%20101%202023.pdf?alt=media&token=2aab058e-56dd-41c1-9bbd-13a312cc3138"));




        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}