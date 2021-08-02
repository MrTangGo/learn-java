package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    StudentService studentService = new StudentService();
    Scanner sc = new Scanner(System.in);

    public void start() {

        studentLoop:
        while (true){
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    //System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudentById();
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updataStudent();
                    break;
                case "4":
                    //System.out.println("查询学生");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("谢谢使用学生管理系统");
                    break studentLoop;
                default:
                    System.out.println("输入错误！请重新输入");
                    break;
            }
        }

    }

    public void updataStudent() {
        String updataId = inputStudentId();
        Student student = inputStudentInfo(updataId);
        studentService.updataStudent(updataId, student);
    }

    public void deleteStudentById() {
        String delId = inputStudentId();
        studentService.deleteStudentById(delId);
        System.out.println("删除成功");
    }

    public void findAllStudent() {
        // 调用业务员中的方法，得到学生的对象数据
        Student[] stus = studentService.findAllStudent();
        // 判断数组的内存地址是否为null
        if(stus == null){
            System.out.println("学生的列表为空，查无此数据" );
            return;
        }
        //遍历数组获得学生信息并打印
        System.out.println("学号\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student != null){
                System.out.println(student.getId() + "\t" + student.getName() + "\t"+ student.getAge() + "\t" + student.getBirthday());
            }
        }
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        String id;
        while(true) {
            System.out.println("请输入学生id");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("学号已经被占用，请重新输入");
            }else {
                break;
            }
        }
        Student student = inputStudentInfo(id);
        boolean result = studentService.addStudent(student);
        if(result){
            System.out.println("添加学生成功");
        }else {
            System.out.println("添加学生失败");
        }

    }

    public String inputStudentId() {
        String id;
        while(true) {
            System.out.println("请输入要更新的学生id");
            id = sc.next();
            boolean exists = studentService.isExists(id);
            if (!exists) {
                System.out.println("学号不存在，请检查学号");
            }else break;
        }
        return id;
    }

    public abstract Student inputStudentInfo(String id);
}
