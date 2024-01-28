package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import android.widget.Button
import android.content.Intent




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bouton_vers_evegreen_trees = findViewById<Button>(R.id.button_transparent_Evergreen_trees )
        bouton_vers_evegreen_trees.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val bouton_vers_palm_trees = findViewById<Button>(R.id.button_transparent_PalmTree )
        bouton_vers_palm_trees.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        val bouton_vers_plante1 = findViewById<Button>(R.id.button_transparent_1)
        bouton_vers_plante1.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val bouton_vers_plante2 = findViewById<Button>(R.id.button_transparent_2)
        bouton_vers_plante2.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        val bouton_vers_plante3 = findViewById<Button>(R.id.button_transparent_3)
        bouton_vers_plante3.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        val bouton_vers_plante4 = findViewById<Button>(R.id.button_transparent_4)
        bouton_vers_plante4.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }



    }
}