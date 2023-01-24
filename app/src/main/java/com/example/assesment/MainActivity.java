package com.example.assesment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView plane,sea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plane=findViewById(R.id.plane);
        sea=findViewById(R.id.sea);

        plane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
        sea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity1();
            }
        });
    }

    private void openActivity() {
        Intent intent=new Intent(this,AirCargo.class);
        startActivity(intent);
    }

    private void openActivity1() {
        Intent intent=new Intent(this,SeaCargo.class);
        startActivity(intent);
    }
}