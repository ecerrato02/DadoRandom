package com.ecerrato.dadorandom

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val numButton: Button = findViewById(R.id.buttonNumero)
        val foto: ImageView = findViewById(R.id.imageViewRandom)

        numButton.setOnClickListener {
            getRandomFoto(foto)
        }
    }

    private fun getRandomFoto(foto: ImageView) {
        val numAleatorio = Random.nextInt(1, 5).toString()
        if (numAleatorio == "1") {
            foto.setImageResource(R.drawable.mbappelo_1)
        } else if (numAleatorio == "2") {
            foto.setImageResource(R.drawable.monkey_2)

        } else if (numAleatorio == "3") {
            foto.setImageResource(R.drawable.penaldo_3)

        } else if (numAleatorio == "4") {
            foto.setImageResource(R.drawable.pessi_4)
        }
        Toast.makeText(this, "El número es: $numAleatorio", Toast.LENGTH_SHORT).show()

    }
}