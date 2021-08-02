package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;


public class StudentDao implements BaseStudentDao {
    private static Student[] students = new Student[5];

    public boolean addStudent(Student student) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            Student stu = students[i];
            if(stu == null){
                index = i;
                break;
            }
        }
        if(index == -1){
            return false;
        }else {
            students[index] = student;
            return true;
        }
    }

    public Student[] findAllStudents() {
        return students;
    }



    public void deleteStudentById(String delId) {
        int index = getIndex(delId);
        students[index] = null;
    }

    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if(student != null && student.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updataStudent(String updataId, Student student) {
        int index = getIndex(updataId);
        students[index] = student;
    }
}
