package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.samplecalculator.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etFNo: EditText=findViewById(R.id.etFNo)
        var etSNo: EditText=findViewById(R.id.etSNo)
        var etRes: EditText=findViewById(R.id.etRes)


        val btAdd: Button =findViewById(R.id.btAdd)
        val btMul:Button=findViewById(R.id.btMul)
        val btDiv:Button =findViewById(R.id.btDiv)
        val btSub:Button =findViewById(R.id.btSub)
        val btMod:Button =findViewById(R.id.btMod)

        btAdd.setOnClickListener {
            val a=etFNo.text.toString().toInt()
            val b= etSNo.text.toString().toInt()
            val res= a+b
            etRes.setText(res.toString())
        }

        btSub.setOnClickListener {
            val a=etFNo.text.toString().toInt()
            val b= etSNo.text.toString().toInt()
            val res= a-b
            etRes.setText(res.toString())
        }

        btMul.setOnClickListener {
            val a=etFNo.text.toString().toInt()
            val b= etSNo.text.toString().toInt()
            val res= a*b
            etRes.setText(res.toString())
        }

        btDiv.setOnClickListener {
            val a=etFNo.text.toString().toInt()
            val b= etSNo.text.toString().toInt()
            val res= a/b
            etRes.setText(res.toString())
        }

        btMod.setOnClickListener {
            val a=etFNo.text.toString().toInt()
            val b= etSNo.text.toString().toInt()
            val res= a%b
            etRes.setText(res.toString())
        }

    }
}