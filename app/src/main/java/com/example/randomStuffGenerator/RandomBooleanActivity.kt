package com.example.randomStuffGenerator

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_random_boolean.*
import kotlin.random.Random

class RandomBooleanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_boolean)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val history: MutableList<String> = ArrayList()
        booleanHistory.movementMethod = ScrollingMovementMethod()

        btnGenerateBoolean.setOnClickListener {
            val random = Random.nextBoolean().toString()
            generatedBoolean.text = random

            history.add(random)
            booleanHistory.text = history.joinToString(separator = "    ")
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}