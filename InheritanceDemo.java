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
        System.out.println("Area of Rectangle");
        return length * breadth;
    }
    double perimeter()
    {
        return 2 * (length + breadth);
    }
}
class Cuboid extends Rectangle
{
    int height;
    Cuboid(int length, int breadth,int height)
    {
        super(length, breadth);
        this.height = height;
    }
    @Override
    int area()
    {
        System.out.println("Area of Cuboid");
        int bottomTop = 2 * (length * breadth);
        int side1_3 = 2 * (breadth *  height);
        int side2_4 = 2 * (length * height);
        
        return bottomTop + side1_3 + side2_4;   
    }
    int volume()
    {
        return length * breadth * height;
    }
}


public class InheritanceDemo {
    public static void main(String [] args)
    {
        Cuboid  cb = new Cuboid(2,3,5);
        
        System.out.println("Area of Cuboid : " + cb.area() );
        System.out.println("Perimeter of Cuboid : " + cb.perimeter());
        System.out.println("Volume of Cuboid : " + cb.volume());

        //Rectangle r = new Rectangle(3,5);
        //System.out.println("Area of Rectangle: " + r.area() );
        //System.out.println("Perimeter of Rectangle : " + r.perimeter());
        //System.out.println("Volume of Rectangle : " + r.volume());
        
    }
}



class A
{
    int a;
    A( )
    {
        System.out.println("FEROZE GANDHI - DEFAULT ");
    }
    A(int  a)
    {
        System.out.println("FEROZE GANDHI - PARAMETERIZED");
    }
}
class B extends A
{
    B( )
    {
        System.out.println("RAHUL GANDHI");
    }
    B(int x )
    {
        super(x);
        System.out.println("RAHUL GANDHI - PARAMETERIZED");
    }
}