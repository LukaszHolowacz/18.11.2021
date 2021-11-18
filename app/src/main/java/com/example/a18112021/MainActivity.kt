package com.example.a18112021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var b1 = findViewById<Button>(R.id.b1);
        var b2 = findViewById<Button>(R.id.b2);

        var t1 = findViewById<TextView>(R.id.t1);
        var t2 = findViewById<TextView>(R.id.t2);

        var s2 = "Łukasz \n Hołowacz";

        b2.setOnClickListener()
        {
            t2.text = s2;
        }
        b1.setOnClickListener()
        {
            t1.text = getResources().getString(R.string.imie)
        }
    }
}