package com.example.lnmcbmprevques;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import soup.neumorphism.NeumorphCardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawerlayout);

        NeumorphCardView cardView1 =findViewById(R.id.cardV1);
        NeumorphCardView cardView2 =findViewById(R.id.cardV2);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);

        toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView = findViewById(R.id.navigation_view);
        navigationView.setItemIconTintList(null);
        drawerLayout = findViewById(R.id.drawer);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.facebookPage:
                        Intent facebook = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/surajprakash.ss"));
                        startActivity(facebook);
                        break;
                    case R.id.more:
                        break;
                    case R.id.nav_rate:

                        try{
                            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id="+getPackageName())));
                        }
                        catch (Exception ex)
                        {
                            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://play.google.com/store/apps/details?id" + getPackageName())));
                        }
                        break;
                    case R.id.nav_share:
                        Intent shareIntent = new Intent(Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Practice Set");
                        String shareMessage = " This App Is Best For IT Students ";
                        shareMessage = shareMessage + "http://play.google.com/store/apps/details?id" + BuildConfig.APPLICATION_ID;
                        shareIntent.putExtra(Intent.EXTRA_TEXT,shareMessage);
                        startActivity(Intent.createChooser(shareIntent,"Choose One"));
                        break;
                }
                return true;
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.cardV1:
            Toast.makeText(MainActivity.this, "Hello MCA Students", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, mca.class);
            startActivity(intent);
            break;
             case R.id.cardV2:
                 Toast.makeText(MainActivity.this, "Hello BCA Students", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, bca.class);
                startActivity(intent);

        }
    }
}
