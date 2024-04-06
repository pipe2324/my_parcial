package com.example.my_parcial

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var mascota: EditText
    private lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mascota = findViewById(R.id.mascota)
        button = findViewById(R.id.averiguar)

        button.setOnClickListener { enviarMensaje() }
    }

    private fun enviarMensaje() {
        val mensaje = mascota.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("mensaje", mensaje)
        startActivity(intent)
    }
}
