package com.example.shpargalkafish;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class Third_Activity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picturelayout);

        ImageView picture = (ImageView) findViewById(R.id.fishPicture);
        String filename = getIntent().getStringExtra("choice") + ".png";
        InputStream inputStream = null;
        try{
            inputStream = getApplicationContext().getAssets().open(filename);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            picture.setImageDrawable(drawable);
            picture.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        catch(IOException e) {
            Toast.makeText(this, "Ошибка", Toast.LENGTH_LONG).show();
        }
    }

}
