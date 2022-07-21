package com.example.throwdiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        var tvResult:TextView = findViewById(R.id.tvResult)
        tvResult.text = number.toString()
        //Toast.makeText(this,number.toString(),Toast.LENGTH_LONG).show()

    }

    //Number aleatorio
    private fun throwDice(max:Int):Int{
        return (1..max).random()
    }

}