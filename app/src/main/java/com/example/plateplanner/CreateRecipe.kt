package com.example.plateplanner

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class CreateRecipe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_recipe)
        val etRecipeName = findViewById<EditText>(R.id.etRecipeName)
        val etIngredients = findViewById<EditText>(R.id.etIngredients)
        val etSteps = findViewById<EditText>(R.id.etSteps)
        val btnSaveRecipe = findViewById<Button>(R.id.btnSaveRecipe)

        btnSaveRecipe.setOnClickListener {
            val recipeName = etRecipeName.text.toString()
            val ingredients = etIngredients.text.toString()
            val steps = etSteps.text.toString()

        }
    }

}