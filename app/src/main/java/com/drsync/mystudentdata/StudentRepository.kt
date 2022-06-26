package com.drsync.mystudentdata

import androidx.lifecycle.LiveData
import com.drsync.mystudentdata.database.entity.Student
import com.drsync.mystudentdata.database.entity.StudentAndUniversity
import com.drsync.mystudentdata.database.StudentDao
import com.drsync.mystudentdata.database.entity.StudentWithCourse
import com.drsync.mystudentdata.database.entity.UniversityAndStudent
import com.drsync.mystudentdata.helper.InitialDataSource
import com.drsync.mystudentdata.helper.SortType
import com.drsync.mystudentdata.helper.SortUtils

class StudentRepository(private val studentDao: StudentDao) {
    fun getAllStudent(sortType: SortType): LiveData<List<Student>> {
        val query = SortUtils.getSortedQuery(sortType)
        return studentDao.getAllStudent(query)
    }
    fun getAllStudentAndUniversity(): LiveData<List<StudentAndUniversity>> = studentDao.getAllStudentAndUniversity()
    fun getAllUniversityAndStudent(): LiveData<List<UniversityAndStudent>> = studentDao.getAllUniversityAndStudent()
    fun getAllStudentWithCourse(): LiveData<List<StudentWithCourse>> = studentDao.getAllStudentWithCourse()

//    suspend fun insertAllData() {
//        studentDao.insertStudent(InitialDataSource.getStudents())
//        studentDao.insertUniversity(InitialDataSource.getUniversities())
//        studentDao.insertCourse(InitialDataSource.getCourses())
//        studentDao.insertCourseStudentCrossRef(InitialDataSource.getCourseStudentRelation())
//    }
}