package co.edu.udea.compumovil.gr01_20201.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

/**
 * Actividad que muestra inicalmente la interfaz de login de usuario.
 * Desde aca se lanzan las demas actividades que componen la aplicacion.
 * */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Creacion de referencias a las vistas
        val et_user_login : EditText = findViewById(R.id.et_user_login)
        val et_password : EditText = findViewById(R.id.et_pasword)
        val btn_login : Button = findViewById(R.id.btn_login)
        val btn_registro : Button = findViewById(R.id.btn_registro)

        // Definicion de la accion que ejecutaran los botones.
        btn_login.setOnClickListener{

            val nomUsuario = et_user_login.text.toString()
            val psUsuario = et_password.text.toString()

            //Implementamos la funcion que creamos para que valide el proceso de logueo del usuario
            login(nomUsuario, psUsuario)
        }

        // Definicion de la accion a ejecutar en el boton de registro
        btn_registro.setOnClickListener{

            registroUsuario()

        }

    }

    private fun registroUsuario() {
        val intent = Intent(this@MainActivity, ActivityDeRegistro::class.java)
        startActivity(intent)
    }

    // Funcion que realiza el proceso de validacion del usuario y la contraseña
    // Ingresadas por la interfaz de logueo.
    private fun login(usuario : String, contrasena : String){

        if(usuario == "max" && contrasena == "12345"){

            //Intent que comunica a la actividad ppal con la actividad de registro.
            val intent = Intent(this@MainActivity, LugaresDeInteres::class.java)
            startActivity(intent)

        }else{
            Toast.makeText(this, getString(R.string.message_bad_login), Toast.LENGTH_SHORT).show()
        }

    }
}