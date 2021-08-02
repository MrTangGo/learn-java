package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.OtherStudentDao;
import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    OtherStudentDao studentDao = new OtherStudentDao();

    public boolean addStudent(Student student) {
        //判断学生是否可以添加到数据中， 查看学号是否已经存在
        return studentDao.addStudent(student);
    }


    public boolean isExists(String id) {
        Student[] stus = studentDao.findAllStudents();

        boolean exists = false;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student != null && student.getId().equals(id)){
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Student[] findAllStudent() {
        // 调用库管对象的findallstudents方法获取学生对象数组
        Student[] students = studentDao.findAllStudents();
        // 判断数组中是否有学生信息
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if(student != null){
                flag = true;
                break;
            }
        }

        // 判断flag
        if(flag){
            return students;
        }else {
            return null;
        }
    }

    public void updataStudent(String updataId, Student student){
        studentDao.updataStudent(updataId, student);
    }

    public void deleteStudentById(String delId) {
         studentDao.deleteStudentById(delId);
    }
}
