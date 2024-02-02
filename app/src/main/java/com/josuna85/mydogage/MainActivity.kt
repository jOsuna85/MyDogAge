package com.josuna85.mydogage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val agedEdit = findViewById<EditText>(R.id.edtxt_age_input)
        val resultText = findViewById<TextView>(R.id.txt_result)
        val buttonCal = findViewById<Button>(R.id.btn_calculate)

        buttonCal.setOnClickListener {
            val ageString = agedEdit.text.toString()
            if(ageString.isNotEmpty()) {
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                resultText.text = "Tu edad canina es de $result años"
            }else{
                Toast.makeText(this,"Agrega tu edad para continuar",Toast.LENGTH_LONG).show()
            }
        }
    }
}