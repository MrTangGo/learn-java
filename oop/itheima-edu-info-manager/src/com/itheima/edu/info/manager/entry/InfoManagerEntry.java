package com.itheima.edu.info.manager.entry;

import com.itheima.edu.info.manager.controller.OtherStudentController;
import com.itheima.edu.info.manager.controller.StudentController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    OtherStudentController otherStudentController = new OtherStudentController();
                    otherStudentController.start();
                    break;
                case "2":
                    //开启老师管理系统
                    break;
                case "3":
                    System.out.println("谢谢使用");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误！请重新输入");
                    break;
            }
        }
    }
}
