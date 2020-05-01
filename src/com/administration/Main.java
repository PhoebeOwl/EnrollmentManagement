package com.administration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Ask how many students to enroll
        List<Student> list=new ArrayList<>();
        System.out.println("enter the number of students to enroll");
        Scanner in= new Scanner(System.in);
        int numberStudents= in.nextInt();
        in.nextLine();
        for(int i=0;i<numberStudents;i++){
            list.add(enrollAStudent());
        }

        System.out.println("Basic Info about enrolled students: ");
        for(int i=0; i<numberStudents;i++){
            System.out.println(list.get(i).getBasicInfo());
        }

    }
    public static Student enrollAStudent(){
        Student stu1= new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.toString());
        return stu1;
    }

}
