/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author 123
 */

class Student
{
    int regno;
    String name;    
    Student()
    {
        System.out.println("Default Constructor - Hashcode of this = " + this.hashCode());
        new Student(0,"Not Set");
        //this(0,"Net Set");
    }
    Student(int regno,String name)
    {
        System.out.println("Parameterized Constructor Hashcode of this = " + this.hashCode());
        this.regno = regno;
        this.name = name;
    }
    
    void display( )
    {
         System.out.println(regno);  //this.regno 
         System.out.println(name);  // this.name 
    }

}

public class ConstructorDelegation {

     static public  void main(String  sikander[] ) {
         //Student    s1 = new Student(1,"Avinash");
         Student    s2 = new Student();
         //System.out.println("Hashcode of s1 = " + s1.hashCode());
         System.out.println("Hashcode of s1 = " + s2.hashCode());
         //s1.display(); // 1, Avinash
         s2.display(); // 0, Not Set
     }
}

