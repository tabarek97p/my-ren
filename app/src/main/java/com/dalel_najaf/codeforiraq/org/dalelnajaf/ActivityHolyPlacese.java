package com.dalel_najaf.codeforiraq.org.dalelnajaf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ActivityHolyPlacese extends AppCompatActivity {
    DatabaseReference ref;
    ListView listView;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy_placese);
        Toolbar supportToolbar_h=findViewById(R.id.supportv7_toolbar);
        setSupportActionBar(supportToolbar_h);
        listView=(ListView)findViewById(R.id.listview_d);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,list);
        listView.setAdapter(adapter);
        ref= FirebaseDatabase.getInstance().getReference("holy");
        ref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String value=dataSnapshot.getValue(String.class);
                list.add(value);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent s = new Intent(view.getContext(),holy_a.class);
                    startActivity(s);}
                    if (position==1){
                    Intent s = new Intent(view.getContext(),holy_b.class);
                    startActivity(s);}
                    if(position==2){
                        Intent s = new Intent(view.getContext(),holy_c.class);
                        startActivity(s);}
                        if (position==3){
                            Intent s = new Intent(view.getContext(),holy_d.class);
                            startActivity(s);}
                            if(position==4){
                                Intent s = new Intent(view.getContext(),holy_e.class);
                                startActivity(s);}
                                 if(position==5){
                    Intent s = new Intent(view.getContext(),holy_f.class);
                    startActivity(s);}
                     if(position==6){
                    Intent s = new Intent(view.getContext(),holy_g.class);
                    startActivity(s);}
                if(position==7){
                    Intent s = new Intent(view.getContext(),holy_h.class);
                    startActivity(s);}
                if(position==8){
                    Intent s = new Intent(view.getContext(),holy_i.class);
                    startActivity(s);}
                if(position==9){
                    Intent s = new Intent(view.getContext(),holy_j.class);
                   startActivity(s);}
                if(position==10){
                    Intent s = new Intent(view.getContext(),holy_k.class);
                    startActivity(s);}
            }
        });
    }
}