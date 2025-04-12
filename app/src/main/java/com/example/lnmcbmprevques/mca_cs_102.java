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

public class mca_cs_102 extends AppCompatActivity  {

    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_cs_102);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "CS-102 2016",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20102%2FCS%20102%202016.pdf?alt=media&token=586c48a2-40ca-4c9d-abb9-859a414ac708"));

        productList.add(new Product(1,
                "CS-102 2017",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20102%2FCS%20102%202017.pdf?alt=media&token=150a9c01-1c10-4dd8-8723-db6bd470404d"));

        productList.add(new Product(1,
                "CS-102 2018",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20102%2FCS%20102%202018.pdf?alt=media&token=40704005-6910-4352-94d8-d547a2d59cec"));

        productList.add(new Product(1,
                "CS-102 2019",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20102%2FCS%20102%202019.pdf?alt=media&token=4d91f88a-ef19-45d8-96ef-7e362133280c"));

        productList.add(new Product(1,
                "CS-102 2020",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20102%2FCS%20102%202020.pdf?alt=media&token=283f4485-df98-4c4c-8704-e58e3e317e3e"));

        productList.add(new Product(1,
                "CS-102 2021",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20102%2FCS%20102%202021.pdf?alt=media&token=5fca7498-c64b-4c36-85e1-de152bbeea4b"));

        productList.add(new Product(1,
                "CS-102 2022",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20102%2FCS%20102%202022.pdf?alt=media&token=1933404f-febd-40b7-b53f-600beeac13fc"));

        productList.add(new Product(1,
                "CS-102 2023",
                R.drawable.courselogo1,
                "https://firebasestorage.googleapis.com/v0/b/prevques-lnm.appspot.com/o/mca%2Fmca%201st%20semester%2FCS%20102%2FCS%20102%202023.pdf?alt=media&token=b51f2221-be37-45ec-8183-7cf5e4a23d78"));



        ProductAdapter adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);
    }

}