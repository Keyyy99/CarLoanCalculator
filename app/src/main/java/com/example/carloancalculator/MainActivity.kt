package com.example.carloancalculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCal.setOnClickListener(){
            val amount:Double =txtInput.text.toString().toDouble() - txtInput2.text.toString().toDouble()
          val rate = txtInput4.text.toString().toDouble()
            val period = Integer.parseInt(txtInput3.text.toString())
            val total:Double = amount*rate*period
            val grand:Double = (amount+total)/period/12
             result1.text = "%.2f".format(amount)
            result2.text = "%.2f".format(total)
            result3.text = "%.2f".format(grand)

            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken,0)
        }
    }
}
