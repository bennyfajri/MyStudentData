package com.drsync.mystudentdata.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class University(
    @PrimaryKey
    val universityId: Int,
    val name: String,
)
