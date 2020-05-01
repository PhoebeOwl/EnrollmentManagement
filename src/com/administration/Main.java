package com.administration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student stu1= new Student("juliva smith", 2018);
        stu1.printAvailableCourses();
        System.out.println("Add your courses for this semester");
        stu1.addCourses(scanner.next());
        scanner.nextLine();
        System.out.println(stu1.toString());
//        File f=new File("courses.txt");
//        System.out.println(f.getAbsolutePath());
    }

}
