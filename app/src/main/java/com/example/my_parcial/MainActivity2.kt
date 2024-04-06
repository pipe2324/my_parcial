package com.example.my_parcial

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var mensaje: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        mensaje = findViewById(R.id.textViewMensaje) // Asignar el TextView


        val mensajeRecibido = intent.getStringExtra("mensaje")


        mensajeRecibido?.let {

            mensaje.text = it
        }
    }
}
