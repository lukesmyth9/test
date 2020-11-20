/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import org.joda.time.*;
/**
 *
 * @author lukej
 */
public class Student {
    //instance variables
    //Course[] courses;
    //Module[] modules;
    ArrayList<Module> modules = new ArrayList<Module>();
    ArrayList<Course> courses = new ArrayList<Course>();
    String name;
    int age;
    LocalDate dateOfBirth;
    int ID;
    String username;
   
    public Student(String name, int age, String dateOfBirth, int ID)
    {
        this.name = name;
        this.age = age;
        this.dateOfBirth = new LocalDate(dateOfBirth);
        this.ID = ID;
       // this.courses = courses;
        //this.modules = modules;
    }
    
//Mutator methods
    
public void setName(String name)
{
    this.name = name;
}
public void setAge(int age)
{
    this.age = age;
}

public void setID(int ID)
{
    this.ID = ID;
}

    //getters
public String getName()
{
    return this.name;
}
public int getAge()
{
    return this.age;
}
public LocalDate getDateOfBirth()
{
    return dateOfBirth;        
}
public int getID()
{
    return this.ID;
}

public String getUsername() 
{
    this.username = this.name + this.age;    
    return username;
}
    public void addModuleToStudent(Module module)
    {
        modules.add(module);
    }
    public void printAssignedCoursesToStudent()
    {
        System.out.println("The student is in this course: ");
        for(Course course : courses)
        {
            System.out.println("Name: " + course.getCourseName() + "\n");
        }
    }
    public void printAssignedModulesToStudents()
    {
        System.out.println("This student has the following modules: ");
        for(Module module : modules)
        {
            System.out.println("Module Name: " + module.getModuleName() + " Module ID: " + module.getID());
        }
    }
    public void addCourseToStudent(Course course)
    {
        courses.add(course);
    }
    public void studentInformation(Student student)
    {
        System.out.println("Student Name: " + student.getName() + "\nUsername: " + student.getUsername() + "\nAge: " + student.getAge() + "\nDate of birth: " + student.getDateOfBirth());
        student.printAssignedCoursesToStudent();
        student.printAssignedModulesToStudents();
    }
    
    
}
