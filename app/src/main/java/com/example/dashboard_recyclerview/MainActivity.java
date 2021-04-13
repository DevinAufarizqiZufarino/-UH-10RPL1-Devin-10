package com.example.dashboard_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<SetterGetter> datamenu;
    GridLayoutManager  gridLayoutManager;
    DashboardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView            =findViewById(R.id.rv_menu);

        addData();
        gridLayoutManager       =new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter     =new DashboardAdapter(datamenu);
        recyclerView.setAdapter(adapter);
    }


    public void addData(){

        datamenu        =new ArrayList<>();
        datamenu.add(new SetterGetter("WhatsApp", "logomenu1"));
        datamenu.add(new SetterGetter("Instagram", "logomenu2"));
        datamenu.add(new SetterGetter("Facebook", "logomenu3"));
        datamenu.add(new SetterGetter("YouTube", "logomenu4"));
        datamenu.add(new SetterGetter("Twitter", "logomenu5"));
        datamenu.add(new SetterGetter("Lokasi", "logomenu6"));
    }
}