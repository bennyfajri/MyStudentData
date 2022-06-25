package com.drsync.mystudentdata.database.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Course(
    @PrimaryKey
    val courseId: Int,
    val name: String,
)
