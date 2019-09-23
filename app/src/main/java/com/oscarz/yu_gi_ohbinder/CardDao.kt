package com.oscarz.yu_gi_ohbinder

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CardDao {
    @Query("SELECT * FROM card")
    fun getAll(): List<Card>

    @Insert
    fun insertAll(vararg cards: Card)

    @Delete
    fun delete(card: Card)
}