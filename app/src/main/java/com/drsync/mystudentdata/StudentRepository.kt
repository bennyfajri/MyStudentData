package com.drsync.mystudentdata

import androidx.lifecycle.LiveData
import com.drsync.mystudentdata.database.Entity.Student
import com.drsync.mystudentdata.database.StudentDao
import com.drsync.mystudentdata.helper.InitialDataSource

class StudentRepository(private val studentDao: StudentDao) {
    fun getAllStudent(): LiveData<List<Student>> = studentDao.getAllStudent()

    suspend fun insertAllData() {
        studentDao.insertStudent(InitialDataSource.getStudents())
        studentDao.insertUniversity(InitialDataSource.getUniversities())
        studentDao.insertCourse(InitialDataSource.getCourses())
    }
}