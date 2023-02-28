package com.kkimsonn.keepinmindsequenceofnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a1 = 0
        var a2 = 0
        var a3 = 0
        var b1 = 0
        var b2 = 0
        var b3 = 0
        var ready = false
        val textViewOne = findViewById<TextView>(R.id.textViewOne)
        val textViewTwo = findViewById<TextView>(R.id.textViewTwo)
        val textViewThree = findViewById<TextView>(R.id.textViewThree)
        val buttonS = findViewById<Button>(R.id.buttonS)
        val firstNumb = findViewById<TextInputLayout>(R.id.first_numb)
        val secondNumb = findViewById<TextInputLayout>(R.id.second_numb)
        val thirdNumb = findViewById<TextInputLayout>(R.id.third_numb)

        a1 = (11..99).random()
        a2 = (11..99).random()
        a3 = (11..99).random()

        textViewOne.text = a1.toString()
        textViewTwo.text = a2.toString()
        textViewThree.text = a3.toString()

        buttonS.setOnClickListener {
            if (ready) {

                b1 = firstNumb.editText?.text.toString().toInt()
                b2 = secondNumb.editText?.text.toString().toInt()
                b3 = thirdNumb.editText?.text.toString().toInt()
                if ((a1==b1)&&(a2==b2)&&(a3==b3)) {buttonS.text = "Perfect!"} else {buttonS.text = "Bad!"}

            }

            if ((a1 !=0 )&&(!ready)) { buttonS.text = "Press \n when \n fill"
            textViewOne.text = "??"
            textViewTwo.text = "??"
            textViewThree.text = "??"
            ready = true}



        }



    }
}