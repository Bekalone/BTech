package com.example.seventhmfirsthm.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [GadgetDTO::class], version = 1)
abstract class GadgetDatabase: RoomDatabase() {

    abstract fun noteDao(): GadgetDao
}