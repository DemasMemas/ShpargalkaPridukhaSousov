package com.example.shpargalkafish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] fishes = {"Щука", "Судак", "Окунь", "Ёрш", "Плотва", "Красноперка", "Лещ", "Сазан", "Карп"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView fishList = (ListView) findViewById(R.id.fishList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fishes);
        fishList.setAdapter(adapter);
        fishList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id){
                String selectedItem = fishes[pos];
            }
        });}
    }