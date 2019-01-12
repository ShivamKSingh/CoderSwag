package com.example.shivam.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.shivam.coderswag.R
import com.example.shivam.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
