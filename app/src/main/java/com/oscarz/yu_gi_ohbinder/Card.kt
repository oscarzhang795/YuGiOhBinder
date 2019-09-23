package com.oscarz.yu_gi_ohbinder

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
class Card {
    @PrimaryKey lateinit var productId: String
    @ColumnInfo(name = "name") lateinit var name: String
    @ColumnInfo(name = "cleanName") lateinit var cleanName: String
    @ColumnInfo(name = "imageUrl") lateinit var imageUrl: String
    @ColumnInfo(name = "categoryId") lateinit var categoryId: String
    @ColumnInfo(name = "groupId") lateinit var groupId: String
    @ColumnInfo(name = "url") lateinit var url: String
    @ColumnInfo(name = "modifiedon") lateinit var modifiedon: Date
}