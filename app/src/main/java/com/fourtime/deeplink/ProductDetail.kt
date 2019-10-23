package com.fourtime.deeplink

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProductDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        //get intent
        val intent = intent
        //get action
        val action = intent.action
        //get data
        val data = intent.data



        Toast.makeText(this, data.toString(), Toast.LENGTH_LONG).show()

    }
}
