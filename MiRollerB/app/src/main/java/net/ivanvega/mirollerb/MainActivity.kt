package net.ivanvega.mirollerb

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var dado1: ImageView
    lateinit var dado2: ImageView
    lateinit var boton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_roller)

        boton = findViewById(R.id.btnClick)
        dado1 = findViewById(R.id.dado1)
        dado2 = findViewById(R.id.dado2)

        boton.setOnClickListener {
            Toast.makeText(applicationContext,
                "Se lanzo", Toast.LENGTH_LONG ).show()
            dado1.setImageDrawable(getRandomDiceImage())
            dado2.setImageDrawable(getRandomDiceImage())
        }
    }

    private fun getRandomDiceImage() : Drawable {
        val numero = (1..6).random()
        var dado : Drawable
        when(numero) {
            1 -> {
                dado = getDrawable(R.drawable.dice_1)!!
            }
            2 -> {
                dado = getDrawable(R.drawable.dice_2)!!
            }
            3 -> {
                dado = getDrawable(R.drawable.dice_3)!!
            }
            4 -> {
                dado = getDrawable(R.drawable.dice_4)!!
            }
            5 -> {
                dado = getDrawable(R.drawable.dice_5)!!
            }
            6 -> {
                dado = getDrawable(R.drawable.dice_6)!!
            }
            else -> {
                dado= getDrawable(R.drawable.empty_dice)!!
            }
        }
        return dado
    }

    fun diceRoller(par: Int = 0): Int{
        return (1..6).random()
    }

}