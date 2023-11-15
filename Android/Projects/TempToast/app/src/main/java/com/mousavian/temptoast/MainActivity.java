package com.mousavian.temptoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.mousavian.templib.LibClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, new LibClass().get("salam"), Toast.LENGTH_SHORT).show();

    }
}