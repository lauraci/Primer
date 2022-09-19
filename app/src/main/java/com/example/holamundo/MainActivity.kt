package com.example.holamundo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var hrInicial: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hrInicial= System.currentTimeMillis();
    }

    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","Ya empezamos")
    }

    override fun onResume() {
        super.onResume()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","Estamos en reposo")
    }

    override fun onPause() {
        super.onPause()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","Estamos en pausa")

        //Asignamos hora actual y restamos (horaActual - horaInicial) Resultado tiempo de ejecución

        val hrActual = System.currentTimeMillis();
        val t = hrActual - hrInicial/1000

        Log.d("Tiempo:", "$t")
    }
}
