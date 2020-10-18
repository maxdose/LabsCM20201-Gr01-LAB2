package co.edu.udea.compumovil.gr01_20201.lab2.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "tblUsuario")
data class Usuario(

    @PrimaryKey(autoGenerate = true)
    var idUs: Int,
    var usPass: String?,
    var usMail: String

)