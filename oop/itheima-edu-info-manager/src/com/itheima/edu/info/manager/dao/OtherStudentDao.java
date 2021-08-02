package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao {
    private static ArrayList<Student> students = new ArrayList<>();

    static {
        Student stu1 = new Student("001", "Tom", "28", "1993-01-03");
        Student stu2 = new Student("002", "Lily", "23", "1995-08-10");

        students.add(stu1);
        students.add(stu2);
    }

    @Override
    public boolean addStudent(Student student) {
        students.add(student);
        return true;
    }

    @Override
    public Student[] findAllStudents() {
        Student[] stus = new Student[students.size()];

        for (int i = 0; i < students.size(); i++) {
            stus[i] = students.get(i);
        }

        return stus;
    }


    @Override
    public void deleteStudentById(String delId) {
        int index = getIndex(delId);
        students.remove(index);
    }

    @Override
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student != null && student.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void updataStudent(String updataId, Student newStudent) {
        int index = getIndex(updataId);
        students.set(index, newStudent);
    }
}
