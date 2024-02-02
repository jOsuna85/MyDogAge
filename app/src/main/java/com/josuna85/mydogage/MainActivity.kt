package com.josuna85.mydogage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.josuna85.mydogage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    // se agrega viewBinding al archivo gradle y posteriormente se tiene que generar la siguiente linea codigo
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //findViewById en una app grande se vuelve pesada ya que busca el ID
        //en todas las vistas o layouts
        //val agedEdit = findViewById<EditText>(R.id.edtxt_age_input)
        val agedEdit = binding.edtxtAgeInput
        //val resultText = findViewById<TextView>(R.id.txt_result)
        val resultText = binding.txtResult
        //val buttonCal = findViewById<Button>(R.id.btn_calculate)
        val buttonCal = binding.btnCalculate

        buttonCal.setOnClickListener {
            val ageString = agedEdit.text.toString()
            if(ageString.isNotEmpty()) {
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                resultText.text = getString(R.string.result_text, result)
                //como buena practica se puede agregar en el archivo string
            }else{
                Toast.makeText(this,R.string.must_input_your_age,Toast.LENGTH_LONG).show()
            }
        }
    }
}