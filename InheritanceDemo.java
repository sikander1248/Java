/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabatchsep;

/**
 *
 * @author 123
 */
class Rectangle{
    int length;
    int breadth;
    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    int area()
    {
        return length * breadth;
    }

    double perimeter()
    {
        return 2 * (length + breadth);
    }
}
public class InheritanceDemo {
    public static void main(String [] args)
    {
        Rectangle r1 = new Rectangle(4, 7);
        
        System.out.println("Area of Rectangle : " + r1.area() ); //28
        
        System.out.println("Perimeter of Rectangle : " + r1.perimeter() ); //22
        
    }
}
