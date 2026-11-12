package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanteState) {
        super.onCreate(savedInstanteState);
        setContentView(R.layout.gridview);

        GridView gridview = findViewById(R.id.grid_view);

        gridview.setAdapter(new ImageAdapter(this));
    }
}