package com.adhitya.uaspbb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adhitya.uaspbb.R

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}