package com.example.admin.mjstudentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AttendActivity extends AppCompatActivity {


    Toolbar toolbar;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attend);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myref = database.getReference();

        FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        String uid = currentFirebaseUser.getUid();

        if (uid.equals((myref.child("users").child("pNzmDClyLyWiQeWnDC4E3Jqxzpr1")).toString())) {
            Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();

        } else if (uid.equals(myref.child("users").child("pNzmDClyLyWiQeWnDC4E3Jqxzpr1").toString())) {
            Toast.makeText(getApplicationContext(), "SUCCESS2", Toast.LENGTH_LONG).show();
        } else if (uid.equals(myref.child("users").child("pNzmDClyLyWiQeWnDC4E3Jqxzpr1").child("uid").toString())) {
            Toast.makeText(getApplicationContext(), "SUCCESS3", Toast.LENGTH_LONG).show();
        } else if (uid.equals((myref.child("users").child("pNzmDClyLyWiQeWnDC4E3Jqxzpr1").child("uid")).toString())) {
            Toast.makeText(getApplicationContext(), "SUCCESS4" +
                    "", Toast.LENGTH_LONG).show();
        }


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() == null) {
            Intent loginActivityIntent = new Intent(AttendActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();
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
            Intent loginActivityIntent = new Intent(AttendActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();
        }else if(id==android.R.id.home){

            finish();

        }
        return super.onOptionsItemSelected(item);
    }

}
