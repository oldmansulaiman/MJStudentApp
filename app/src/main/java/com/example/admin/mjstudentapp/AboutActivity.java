package com.example.admin.mjstudentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class AboutActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemReselectedListener {

    Toolbar toolbar;
    BottomNavigationView bottomNavigationView;
    TextView txt;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() == null) {
            Intent loginActivityIntent = new Intent(AboutActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();
        }

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation_id);
        txt = (TextView) findViewById(R.id.text_id);

        bottomNavigationView.setOnNavigationItemReselectedListener(this);

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
            Intent loginActivityIntent = new Intent(AboutActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();
        }else if(id==android.R.id.home){

            finish();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onNavigationItemReselected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.bushra_id:

                txt.setText(getResources().getText(R.string.bushra));
                break;

            case R.id.sulaiman_id:

                txt.setText(getResources().getText(R.string.sulaiman));
                break;

            case R.id.special_id:

                txt.setText(getResources().getText(R.string.special_thanks));
                break;
        }

    }
}
