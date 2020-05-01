package com.administration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student stu1= new Student();
        System.out.println("Add your courses for this semester");
        stu1.enroll();
        System.out.println(stu1.toString());
//        File f=new File("courses.txt");
//        System.out.println(f.getAbsolutePath());
    }

}
