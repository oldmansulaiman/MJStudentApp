package com.example.admin.mjstudentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;

public class StudentActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() == null) {
            Intent loginActivityIntent = new Intent(StudentActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();
        }

        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewPager_id);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new AcmFragment(), "ACM");
        viewPagerAdapter.addFragment(new CsiFragment(), "CSI");
        viewPagerAdapter.addFragment(new EcellFragment(), "Ecell");
        viewPagerAdapter.addFragment(new EwbFragment(), "EWB");
        viewPagerAdapter.addFragment(new IeeeFragment(), "IEEE");
        viewPagerAdapter.addFragment(new OratorsFragment(), "ORATORS'");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id==R.id.item1_id){

            firebaseAuth.signOut();
            Intent loginActivityIntent = new Intent(StudentActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();
        }else if(id==android.R.id.home){

            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
