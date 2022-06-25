package com.drsync.mystudentdata.database.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class University(
    @PrimaryKey
    val universityId: Int,
    val name: String,
)
