package com.example.admin.mjstudentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AttendActivity extends AppCompatActivity {


    Toolbar toolbar;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attend);

        Button send = (Button) findViewById(R.id.send);
        final TextView attend = (TextView) findViewById(R.id.percentage);

        final FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference();


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() == null) {
            Intent loginActivityIntent = new Intent(AttendActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();
        }

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firebaseDatabase.getReference("users/UID/pNzmDClyLyWiQeWnDC4E3Jqxzpr1/attendance")
                        .addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                attend.setText(value);
                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {

                            }
                        });
            }
        });

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
