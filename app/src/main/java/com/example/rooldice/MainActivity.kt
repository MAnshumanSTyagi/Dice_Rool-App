package com.example.rooldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            rollDice()
        }
    }



    fun rollDice(){
        val chance=Dice(6)
        val no=chance.roll()
        val imageid=when(no){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6

        }

        imageView2.setImageResource(imageid)
    }

}





class Dice(private val nos:Int){

    fun roll():Int{
        return (1..nos).random()
    }
}