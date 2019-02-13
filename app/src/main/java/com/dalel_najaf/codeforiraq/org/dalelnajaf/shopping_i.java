package com.dalel_najaf.codeforiraq.org.dalelnajaf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class shopping_i extends AppCompatActivity {
    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_i);
        Toolbar supportToolbar_iii=findViewById(R.id.supportv7_toolbar);
        setSupportActionBar(supportToolbar_iii);

        //Actionbar
        //     ActionBar actionBar = getSupportActionBar();
        //set title
        //    actionBar.setTitle("دليل النجف");
        //RecyclerView
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        //set layout as LinearLayout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //send Query to FirebaseDatabase
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("shopping_i");
    }
    //load data into recycler view onStart
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Model, ViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<Model, ViewHolder>(
                        Model.class,
                        R.layout.row,
                        ViewHolder.class,
                        mRef
                ) {
                    @Override
                    protected void populateViewHolder(ViewHolder viewHolder, Model model, int position) {
                        viewHolder.setDetails(getApplicationContext(), model.getTitle(), model.getDescription(), model.getImage());
                    }

                };
        //set adapter to recyclerview
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }}

