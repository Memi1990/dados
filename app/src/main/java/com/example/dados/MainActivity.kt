package com.example.dados

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.dados.databinding.ActivityMainBinding
import java.util.*
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    lateinit var b:ActivityMainBinding

//    var dados = arrayOf(R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b =ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

    b.btnRoll.setOnClickListener {
        val n1 = Random.nextInt(1..7)
        val n2 = Random.nextInt(1..7)
        b.imvDado1.setImageResource( when(n1){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6 }
        )

        b.imvDado2.setImageResource( when(n2){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6 }
        )
        if (n1>n2){
            b.tvResult.text = getText(R.string.winner1)
        }else if (n1<n2){
            b.tvResult.text = getText(R.string.winner2)
        }else b.tvResult.text = "Empate"
    }

    }
//    fun roll(num:Int) {
//    val imgResource = when(num){
//        1 -> R.drawable.dice1
//        2 -> R.drawable.dice2
//        3 -> R.drawable.dice3
//        4 -> R.drawable.dice4
//        5 -> R.drawable.dice5
//        else -> R.drawable.dice6 }
//    }
}