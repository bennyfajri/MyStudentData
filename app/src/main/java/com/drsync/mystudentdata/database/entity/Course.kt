package com.drsync.mystudentdata.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Course(
    @PrimaryKey
    val courseId: Int,
    val name: String,
)
