package co.edu.udea.compumovil.gr01_20201.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LugaresDeInteres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lugares_de_interes)

        val selccionarPOI = findViewById<Button>(R.id.btn_seleccionar)

        selccionarPOI.setOnClickListener({

        })
    }
}