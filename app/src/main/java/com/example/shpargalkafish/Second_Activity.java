package com.example.shpargalkafish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Second_Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView info = (TextView) findViewById(R.id.infoView);
    try {
        String choice = getIntent().getStringExtra("choice");

    } catch (Exception e){
        Toast.makeText(this, "Что-то пошло не так...", Toast.LENGTH_LONG).show();
    }
}
    public void showPicture(View view){
        Intent pictureIntent = new Intent(Second_Activity.this, Third_Activity.class);
        pictureIntent.putExtra("choice", getIntent().getStringExtra("choice"));
        startActivity(pictureIntent);
    }
}
