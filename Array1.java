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
 class Array1 {

     static public  void main(String  sikander[] ) {
        // TODO code application logic here
        int arr1[] = {12,23,34};
        int []arr2 = {5,3,1,6,9};
    
        System.out.println("Number of elements in arr1 : " + arr1.length);
        System.out.println("Number of elements in arr2 : " + arr2.length);
        
        System.out.println("Elements of Array 1 ");
        for(int ele : arr1)
            System.out.print(ele + " ");
        System.out.println("\nElements of Array 2 ");
    
        for(int ele : arr2)
            System.out.print(ele + " ");
     }
}

