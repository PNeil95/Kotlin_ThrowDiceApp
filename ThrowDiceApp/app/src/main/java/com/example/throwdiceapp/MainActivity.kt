package com.example.throwdiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnThrow:Button = findViewById(R.id.btnThrow)
        btnThrow.setOnClickListener {
            //Prueba
            // Toast.makeText(this,"Presiono el Boton", Toast.LENGTH_LONG).show()
            rollDice()
        }

    }

    //Get Number Aleatorio
    private fun rollDice(){
        var number:Int = throwDice(6)
        val tvResult:TextView = findViewById(R.id.tvResult)
        tvResult.text = number.toString()

        val drawableResource = when(number) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        //Toast.makeText(this,number.toString(),Toast.LENGTH_LONG).show()
        val imgDice:ImageView = findViewById(R.id.imgDice)
        //View img
        imgDice.setImageResource(drawableResource)

    }

    //Number aleatorio
    private fun throwDice(max:Int):Int{
        return (1..max).random()
    }

}