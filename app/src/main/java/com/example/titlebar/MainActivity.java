package com.example.titlebar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TitleBar titleBar = findViewById(R.id.title);
        titleBar.setTitleSize(20);
        titleBar.setTitle("标题栏");
        titleBar.setOnViewClick(new TitleBar.onViewClick() {
            @Override
            public void leftClick() {
                Toast.makeText(MainActivity.this, "左边", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rightClick() {
                Toast.makeText(MainActivity.this, "右边", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
