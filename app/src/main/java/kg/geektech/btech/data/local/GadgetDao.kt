package com.example.seventhmfirsthm.data.local

import androidx.room.*
import kg.geektech.btech.data.network.model.GadgetDTO

@Dao
interface GadgetDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addGadget(gadget: GadgetDTO)

    @Query("SELECT * FROM gadget")
    suspend fun getAllGadget(): List<GadgetDTO>

    @Delete
    suspend fun deleteGadget(gadget: GadgetDTO)
}