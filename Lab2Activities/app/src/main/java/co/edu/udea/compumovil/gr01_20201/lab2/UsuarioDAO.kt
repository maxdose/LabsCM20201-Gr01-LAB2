package co.edu.udea.compumovil.gr01_20201.lab2

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDao {
    @Insert
    fun insertUser(usuario: Usuario)

    @Update
    fun updateUser(vararg usuario: Usuario)

    @Delete
    fun deleteUser(vararg usuario: Usuario)

    @Query("SELECT * FROM tblUsuario")
    fun getOrderedUsers(): LiveData<List<Usuario>>
}