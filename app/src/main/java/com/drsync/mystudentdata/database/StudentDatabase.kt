package com.drsync.mystudentdata.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.drsync.mystudentdata.database.Entity.Course
import com.drsync.mystudentdata.database.Entity.Student
import com.drsync.mystudentdata.database.Entity.University

@Database(entities = [Student::class, University::class, Course::class], version = 1, exportSchema = false)
abstract class StudentDatabase : RoomDatabase(){

    abstract fun studentDao(): StudentDao

    companion object {
        @Volatile
        private var INSTANCE: StudentDatabase? = null

        @JvmStatic
        fun getDatabase(context: Context): StudentDatabase {
            if (INSTANCE == null) {
                synchronized(StudentDatabase::class.java) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        StudentDatabase::class.java, "student_database")
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE as StudentDatabase
        }

    }
}