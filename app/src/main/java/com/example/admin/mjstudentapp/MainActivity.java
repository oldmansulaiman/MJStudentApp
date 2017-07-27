package com.example.admin.mjstudentapp;

import android.content.Intent;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() == null) {
            Intent loginActivityIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();//is thi
        }

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);

        toggle.syncState();

    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){

            drawerLayout.closeDrawer(GravityCompat.START);

        }else {

            super.onBackPressed();

        }
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
            Intent loginActivityIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();
        }else if(id==android.R.id.home){

            finish();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.attendance_id:

                Intent intent = new Intent(MainActivity.this, AttendActivity.class);
                startActivity(intent);
                break;

            case R.id.marks_id:

                Intent intent1 = new Intent(MainActivity.this, MarksActivity.class);
                startActivity(intent1);
                break;

            case R.id.student_activities_id:

                Intent intent2 = new Intent(MainActivity.this, StudentActivity.class);
                startActivity(intent2);
                break;

            case R.id.resources_id:

                Intent intent3 = new Intent(MainActivity.this, ResourcesActivity.class);
                startActivity(intent3);
                break;

            case R.id.vision_id:

                Intent intent4 = new Intent(MainActivity.this, VisionActivity.class);
                startActivity(intent4);
                break;

            case R.id.mission_id:

                Intent intent5 = new Intent(MainActivity.this, MissionActivity.class);
                startActivity(intent5);
                break;

            case R.id.about_us_id:

                Intent intent6 = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent6);
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

}