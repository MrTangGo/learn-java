package com.itheima.edu.info.manager.controller;
import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;
import java.util.Scanner;

public class StudentController extends BaseStudentController{
    Scanner sc = new Scanner(System.in);

    public Student inputStudentInfo(String id){
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生出生日期");
        String birthday = sc.next();

        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        student.setName(name);
        student.setBirthday(birthday);
        return student;
    }
}
