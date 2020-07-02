package com.example.codingtestbinar.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.codingtestbinar.R
import com.example.codingtestbinar.presenter.DicePresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var presenter : DicePresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = DicePresenter()
        presenter.setView(this)

        btn_dice.setOnClickListener {
            presenter.diceGame()
        }
    }

    override fun result(result: String) {
        tv_dice.text = result
    }

}