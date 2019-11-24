package com.sumitrcorp.expensemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
   LinearLayout linear_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear_layout=findViewById(R.id.linear_layout);
        linear_layout.setOnClickListener(view->{
            Intent intent=new Intent(MainActivity.this,Products.class);
            startActivityForResult(intent,1);

        });
    }
}
