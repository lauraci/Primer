package com.example.holamundo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var hrInicial: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hrInicial= System.nanoTime();
    }

    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onStart")
    }

    override fun onResume() {
        super.onResume()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onResume")
    }

    override fun onPause() {
        super.onPause()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onResume")

        //Asignamos hora actual y restamos (horaActual - horaInicial) Resultado tiempo de ejecución

        val hrActual = System.nanoTime();
        val t = hrActual - hrInicial

        Log.d("Tiempo:", "$t")
    }
}