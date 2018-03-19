package com.example.dialpe.animacionyfragment

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch
import kotlin.coroutines.experimental.CoroutineContext

class MainActivity : AppCompatActivity() {

    var contador=0
    private val uiContext = UI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pressMeButton.setOnClickListener{
            animarBoton()
        }
    }


    private fun animarBoton(){
        if(contador == 0){
            contadorCero()
        }else if (contador == 1){
            contadorUno()
        }else if (contador == 2){
            contadorDos()
        }else if (contador == 3){
            contadorTres()
        }else{
            contadorCuatro()
        }
        contador++
    }

    private fun contadorCero() = launch(uiContext){
        val objectAnimator = ObjectAnimator.ofFloat(
                pressMeButton,
                "translationY",
                -600f)
        objectAnimator.duration = 100L
        objectAnimator.interpolator
        objectAnimator.start()
        val objectAnimator2 = ObjectAnimator.ofFloat(
                pressMeButton,
                "translationX",
                -200f)
        objectAnimator2.duration = 100L
        objectAnimator2.interpolator
        objectAnimator2.start()
    }


    private fun contadorUno() = launch(uiContext){
        val objectAnimator = ObjectAnimator.ofFloat(
                pressMeButton,
                "translationY",
                700f)
        objectAnimator.duration = 100L
        objectAnimator.interpolator
        objectAnimator.start()
        val objectAnimator2 = ObjectAnimator.ofFloat(
                pressMeButton,
                "translationX",
                300f)
        objectAnimator2.duration = 100L
        objectAnimator2.interpolator
        objectAnimator2.start()
    }


    private fun contadorDos() = launch(uiContext){
        val objectAnimator = ObjectAnimator.ofFloat(
                pressMeButton,
                "translationY",
                -100f)
        objectAnimator.duration = 100L
        objectAnimator.interpolator
        objectAnimator.start()
        val objectAnimator2 = ObjectAnimator.ofFloat(
                pressMeButton,
                "translationX",
                -100f)
        objectAnimator2.duration = 100L
        objectAnimator2.interpolator
        objectAnimator2.start()
    }


    private fun contadorTres() = launch(uiContext){
        val objectAnimator = ObjectAnimator.ofFloat(
                pressMeButton,
                "translationY",
                -710f)
        objectAnimator.duration = 100L
        objectAnimator.interpolator
        objectAnimator.start()
        val objectAnimator2 = ObjectAnimator.ofFloat(
                pressMeButton,
                "translationX",
                400f)
        objectAnimator2.duration = 100L
        objectAnimator2.interpolator
        objectAnimator2.start()
    }

    private fun contadorCuatro(){
        val datos = Intent(this, Main2Activity::class.java)
        datos.putExtra("key1", "valor1")
        startActivity(datos)
    }

}