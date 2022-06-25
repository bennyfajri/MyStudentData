package com.drsync.mystudentdata.database.entity

import androidx.room.Embedded
import androidx.room.Relation

data class StudentAndUniversity(
    @Embedded
    val student: Student,

    @Relation(
        parentColumn = "univId",
        entityColumn = "universityId"
    )
    val university: University? = null
)