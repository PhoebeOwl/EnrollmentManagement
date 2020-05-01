package com.administration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private String ID;
    private int grade;
    private static int id =1000;
    private int balance=0;
    private static int costPerCourse = 600;
    private int tuition=0;
    private ArrayList<String> coursesEnrolled= new ArrayList<>();
    private ArrayList<String> coursesAvailable = new ArrayList<>();

    public Student(){
        id ++;//id plus one each time one new student is added
        Scanner in= new Scanner(System.in);
        System.out.println("enter your name:");
        this.name=in.next();
        in.nextLine();
        System.out.println("your grade: 1 - freshmen; 2 - sophomore; 3 - junior; 4 - senior");
        this.grade = in.nextInt();
        this.ID = generateID();


        // read in available courses
        try{
            Scanner scanner= new Scanner(new BufferedReader(new FileReader("C:\\Users\\feimaomao\\IdeaProjects\\EnrollmentManagement\\src\\com\\administration\\courses.txt")));

            while (scanner.hasNextLine()){
                String course = scanner.nextLine();
                coursesAvailable.add(course);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public String generateID(){
        int firstDigit= grade;
        //The java string valueOf() method converts different types of values into string
        // StringBuilder sb=new StringBuilder(5)
        // sb.append(firstDigit)
        // sb.append(id)
        return String.valueOf(firstDigit) + id;

    }
    public void printAvailableCourses(){
        System.out.println("course available: "+coursesAvailable);
    }
    // enroll courses in a loop; calculate tuition;
    public void enroll(){
        Scanner in= new Scanner(System.in);
        System.out.println("Available courses as follows:  ");
        //show available courses
        printAvailableCourses();
        do{
            System.out.println("enter course name (Q = quit): ");
            String course=in.next();
            in.nextLine();
            if(coursesAvailable.contains(course)) {
                coursesEnrolled.add(course);
                tuition += costPerCourse;
                balance -= costPerCourse;
            }else if(course.equals("Q")){
                break;
            }else{
                System.out.println("course not available to you");
            }
        }while(true);
    }
    public void payTuition(int payment){
        balance +=payment;
    }
    public int getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", tuition=" + tuition +'\''+
                ", balance=" + getBalance() +'\''+
                ", coursesEnrolled=" + coursesEnrolled +
                '}';
    }
}
