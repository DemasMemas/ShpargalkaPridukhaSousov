package com.example.shpargalkafish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.MissingResourceException;

public class Second_Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        StringBuilder finalStr = new StringBuilder();
        String fileName = getIntent().getStringExtra("choice") + ".txt";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(getAssets().open(fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                finalStr.append(line).append("\n");
            }
        } catch (IOException e) {
            Toast.makeText(this, "Ошибка", Toast.LENGTH_LONG).show();
        }
        TextView header = findViewById(R.id.textView2);
        TextView info = findViewById(R.id.textView);
        info.setText(finalStr);
        header.setText(getIntent().getStringExtra("choice"));
}
    public void showPicture(View view){
        Intent pictureIntent = new Intent(Second_Activity.this, Third_Activity.class);
        pictureIntent.putExtra("choice", getIntent().getStringExtra("choice"));
        startActivity(pictureIntent);
    }
}

