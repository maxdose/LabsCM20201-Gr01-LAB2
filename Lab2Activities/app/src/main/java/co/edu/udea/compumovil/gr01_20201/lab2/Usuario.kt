package co.edu.udea.compumovil.gr01_20201.lab2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "tblUsuario")
data class Usuario(
    @PrimaryKey()
    @ColumnInfo(name = "strNomUsuario") val nomUsuario: String,
    @ColumnInfo(name = "strPassword") val password: String,
    @ColumnInfo(name = "strEmail") val email: String


)