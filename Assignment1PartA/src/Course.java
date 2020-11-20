/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import org.joda.time.*;
/**
 *
 * @author lukej
 */
public class Course {
    
    String courseName;
    ArrayList<Module> modules = new ArrayList<Module>();
    ArrayList<Student> students = new ArrayList<Student>();
    LocalDate startDate;
    LocalDate endDate;
    //constructor
    public Course(String courseName, String startDate, String endDate)
    {
        this.courseName = courseName;
        //this.modules = modules;
        //this.students = students;
        this.startDate = new LocalDate(startDate);
        this.endDate = new LocalDate(endDate);
    }
    
    //Mutator methods
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    
    //Accessor Methods
    public String getCourseName()
    {
        return this.courseName;
    }
    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void printStudentsEnrolled()
    {
        System.out.println("The following students are enrolled in this course: ");
        for(Student student : students)
        {
            System.out.println("Name: " + student.getName() + " Username: " + student.getUsername());
        }
    }
    public void printModules()
    {
        System.out.println("The following Modules are enrolled in this course: ");
        for(Module module : modules)
        {
            System.out.println("Module Name: " + module.getModuleName() + " Module ID: " + module.getID());
        }
    }
    public void addModule(Module module)
    {
        modules.add(module);
    }
    
    public LocalDate getStartDate()
    {
        return this.startDate;
    }
    public LocalDate getEndDate()
    {
        return this.endDate;
    }
    
    
    public void courseInformation(Course course)
    {
        System.out.println("Course Name: " + course.getCourseName() + "\nStart Date: " + course.getStartDate() + "\nEnd Date: " + course.getEndDate() + "\n");
       course.printStudentsEnrolled();
   System.out.println("\n");
       course.printModules();
    }
    
}
