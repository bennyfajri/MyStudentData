package com.drsync.mystudentdata.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class University(
    @PrimaryKey
    val universityId: Int,
    @ColumnInfo(name = "universityName")
    val name: String,
)
