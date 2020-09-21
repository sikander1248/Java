/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author 123
 */
 class UnsignedRightShift {

     static void printBinary(int a)
     {
        for(int mask = 1 << 7 ; mask != 0 ; mask = mask >>> 1)
        {     
            if( (a & mask) != 0)
            {
                System.out.print("1");
            }
            else
            {
                System.out.print("0");
            }
        }
        System.out.println();
     }
     static public  void main(String  sikander[] ) {
        // TODO code application logic here
        int x = 0x82345678; //If 8th digit(MSB) is between 0-7 MSB Bit is 0
                            // if 8th digit is between 8 - F MSB bit is 1      
        int y = 1;
        int  res1 = x >> 1; 
        int  res2 = x >>> 1;
        
        System.out.println("x = " + Integer.toHexString(x)); 
        System.out.println("res1(>>) = " + Integer.toHexString(res1) ) ;
        System.out.println("res1(>>>) = " + Integer.toHexString(res2));
        
        printBinary(x);
        printBinary(res1);
        printBinary(res2);
        
    }
}

