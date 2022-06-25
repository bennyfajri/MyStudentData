package com.drsync.mystudentdata.database.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(
    @PrimaryKey
    val studentId: Int,
    val name: String,
    val univId: Int,
)