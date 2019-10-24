package com.example.practical1week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = this.findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val resultText: TextView = findViewById(R.id.result_text)
        val countButton: Button = findViewById(R.id.count_up)
        countButton.setOnClickListener { countUp() }
        val resetButton: Button = findViewById(R.id.reset)
        resetButton.setOnClickListener { resetFunc() }
    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked",
        //Toast.LENGTH_SHORT).show()
        val randomInt = Random().nextInt(6) + 1
        result_text.text = randomInt.toString()
        val randomInt1 = Random().nextInt(6) + 1
        result_text1.text = randomInt1.toString()
        val randomInt2 = Random().nextInt(6) + 1
        result_text2.text = randomInt2.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)

        if (resultText.text == "Hello World!") {
            total.text = "1"
            if (resultText1.text == "Hello World!") {
                total.text = "1"
            }
            if (resultText2.text == "Hello World!") {
                total.text = "1"
            }
        } else {
            var num = resultText.text.toString().toInt()
            var num2 = resultText1.text.toString().toInt()
            var num3 = resultText2.text.toString().toInt()
            var sum = 0

            sum = num + num2 + num3
            total.text = sum.toString()
        }
    }
    private fun resetFunc(){
        result_text.text = "Hello World!"
        result_text1.text = "Hello World!"
        result_text2.text = "Hello World!"
        total.text = ""
    }
}

