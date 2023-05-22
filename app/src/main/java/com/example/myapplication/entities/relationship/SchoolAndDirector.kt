package com.example.myapplication.entities.relationship

import androidx.room.Embedded
import androidx.room.Relation
import com.example.myapplication.entities.Director
import com.example.myapplication.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)
