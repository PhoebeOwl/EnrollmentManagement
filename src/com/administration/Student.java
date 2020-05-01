package com.administration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private String ID;
    private int deposit=0;
    private int costPerCourse =600;
    private int tuition=0;
    private ArrayList<String> coursesEnrolled= new ArrayList<>();
    private ArrayList<String> coursesAvailable = new ArrayList<>();

    public Student(String name, int year){
        this.name=name;
        this.ID = generateID(year);


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
    public String generateID(int year){
        StringBuilder sb= new StringBuilder(6);
        int firstDigit= 2020-year;
        sb.append(firstDigit);
        int restDigits= (int) (Math.random()*100000);
        sb.append(restDigits);
        return sb.toString();

    }
    public void printAvailableCourses(){
        System.out.println("course available: "+coursesAvailable);
    }
    public void addCourses(String course){
        if(coursesAvailable.contains(course)){
            coursesEnrolled.add(course);
        } else{
            System.out.println("course not available to you");
        }
    }
    public void setDeposit(int amount){
        this.deposit += amount;
    }
    public int getTuition(){
        tuition=coursesEnrolled.size()* costPerCourse;
        return tuition;
    }
    public int getBalance(){
        return deposit-tuition;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", tuition=" + getTuition() +
                ", balance=" + getBalance() +
                ", coursesEnrolled=" + coursesEnrolled +
                '}';
    }
}
