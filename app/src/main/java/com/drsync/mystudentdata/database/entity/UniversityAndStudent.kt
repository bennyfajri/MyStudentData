package com.drsync.mystudentdata.database.entity

import androidx.room.Embedded
import androidx.room.Relation

data class UniversityAndStudent(
    @Embedded
    val university: University,

    @Relation(
        parentColumn = "universityId",
        entityColumn = "univId"
    )
    val student: List<Student>
)
