package com.example.simple_calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var n1: EditText?= null
    private var n2: EditText?= null
    private var Add: Button?= null
    private var Sub: Button?= null
    private var Mul: Button?= null
    private var Div: Button?= null
    private var Mod: Button?= null
    private var Result: TextView?= null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        n1= findViewById<View>(R.id.editTextText) as EditText
        n2= findViewById<View>(R.id.editTextText2) as EditText
        Add= findViewById<View>(R.id.button2) as Button
        Sub= findViewById<View>(R.id.button3) as Button
        Mul= findViewById<View>(R.id.button4) as Button
        Div= findViewById<View>(R.id.button5) as Button
        Mod= findViewById<View>(R.id.button6) as Button
        Result= findViewById<View>(R.id.textView2) as TextView

        Add!!.setOnClickListener()
        {
            val nu1 = n1!!.text.toString().toInt()
            val nu2 = n2!!.text.toString().toInt()
            val sum: Int
            sum= nu1+nu2
            Result!!.text = "Result:$sum"
        }

        Sub!!.setOnClickListener()
        {
            val nu1 = n1!!.text.toString().toInt()
            val nu2 = n2!!.text.toString().toInt()
            val sub: Int
            sub= nu1-nu2
            Result!!.text = "Result:$sub"
        }

        Mul!!.setOnClickListener()
        {
            val nu1 = n1!!.text.toString().toInt()
            val nu2 = n2!!.text.toString().toInt()
            val mul: Int
            mul= nu1*nu2
            Result!!.text = "Result:$mul"
        }

        Div!!.setOnClickListener()
        {
            val nu1 = n1!!.text.toString().toInt()
            val nu2 = n2!!.text.toString().toInt()
            val div: Int
            div= nu1/nu2
            Result!!.text = "Result:$div"
        }
        Mod!!.setOnClickListener {
            val nu1 = n1!!.text.toString().toInt()
            val nu2 = n2!!.text.toString().toInt()

            val mod = nu1 % nu2 // Store the result of the modulus operation in a variable

            Result!!.text = "Result: $mod" // Display the result in the TextView
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}