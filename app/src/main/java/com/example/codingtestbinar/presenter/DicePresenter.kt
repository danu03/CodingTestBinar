package com.example.codingtestbinar.presenter

import android.util.Log
import com.example.codingtestbinar.view.MainView
import kotlin.math.log

class DicePresenter(){
    private lateinit var view: MainView

    fun setView(view: MainView){
        this.view = view
    }
    private var score : Int = 0
    fun diceGame() {
        when ((1..6).random()){
            1 -> {
                score = 5
                view.result("1")
                Log.d("tag", "1")
                Log.d("Score", score.toString())
            }
            2 -> {
                score = -3
                view.result("2")
                Log.d("tag", "2")
                Log.d("Score", score.toString())
            }
            3 -> {
                score = 5
                view.result("3")
                Log.d("tag", "3")
                Log.d("Score", score.toString())
            }
            4 -> {
                score = -3
                view.result("4")
                Log.d("tag", "4")
                Log.d("Score", score.toString())
            }
            5 -> {
                score = 5
                view.result("5")
                Log.d("tag", "5")
                Log.d("Score", score.toString())
            }
            6 -> {
                score = -3
                view.result("6")
                Log.d("tag", "6")
                Log.d("Score", score.toString())
            }
        }
    }
}