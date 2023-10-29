package com.example.recyclerviewcarsex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcarsex.Adapter.CustomAdapter;
import com.example.recyclerviewcarsex.Model.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model>modelList;

    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        modelList = new ArrayList<>();

        Model c1 = new Model(R.drawable.a, "Audi");
        Model c2 = new Model(R.drawable.c, "Benz");
        Model c3 = new Model(R.drawable.b, "BMW");
        Model c4 = new Model(R.drawable.e, "Ferrari");
        Model c5 = new Model(R.drawable.d, "Jaguar");
        Model c6 = new Model(R.drawable.c, "Audi");
        Model c7 = new Model(R.drawable.b, "Benz");


        modelList.add(c1);
        modelList.add(c2);
        modelList.add(c3);
        modelList.add(c4);
        modelList.add(c5);
        modelList.add(c6);
        modelList.add(c7);

        customAdapter = new CustomAdapter(modelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapter);
    }
}