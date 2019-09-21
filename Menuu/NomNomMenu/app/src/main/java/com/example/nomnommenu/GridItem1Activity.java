package com.example.nomnommenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GridItem1Activity extends AppCompatActivity {

    TextView name1;
    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item1);

        name1 = findViewById(R.id.griddata1);
        image1 = findViewById(R.id.imageView1);

        Intent intent = getIntent();
        name1.setText(intent.getStringExtra("name"));
        image1.setImageResource(intent.getIntExtra("image",0));



    }
}
