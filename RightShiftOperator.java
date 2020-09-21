class RightShiftOperator {

     static void printBinary(int a)
     {
        for(int mask = 128 ; mask > 0 ; mask = mask / 2)
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
        int x = 0x85;
        int y = 1;
        int  res = x >> 1; 
        
        
        
        printBinary(x);
        printBinary(res);
        
        System.out.println("---------------------");
        System.out.println(res); 
        printBinary( res );
        
    }
}