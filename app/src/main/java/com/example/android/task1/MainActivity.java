package com.example.android.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.*;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mrecyclerview;
    private Adapter madapterr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecyclerview=(RecyclerView)findViewById(R.id.recyclerview);

        ArrayList<UsersClass> list = new ArrayList<>();
        list.add(new UsersClass("John",20));
        list.add(new UsersClass("Karan",30));
        list.add(new UsersClass("Chaitali",20));
        list.add(new UsersClass("Raj",25));
        list.add(new UsersClass("Prajakta",18));
        list.add(new UsersClass("Apoorva",40));
        list.add(new UsersClass("Rajesh",49));
        list.add(new UsersClass("Sara",10));
        list.add(new UsersClass("Avanti",16));
        list.add(new UsersClass("Ira",50));



        madapterr=new Adapter(this,list);
        mrecyclerview.setAdapter(madapterr);


    }

}
