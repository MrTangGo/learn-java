package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public interface BaseStudentDao {
    public abstract boolean addStudent(Student student);
    public abstract Student[] findAllStudents();
    public abstract void deleteStudentById(String delId);
    public abstract int getIndex(String id);
    public abstract void updataStudent(String updataId, Student newStudent);
}
