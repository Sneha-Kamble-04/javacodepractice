package Demo;
//Java Program to implement
//Uniary Operators
import java.io.*;
//Driver Class
class UnaryOperex {
   // main function
 public static void main(String[] args)
 {
     // Interger declared
     int a = 10;
//     int b = 10;
     System.out.println("The value of a is before applying post increment Operator = "+a);
     // Using uniary operators
     System.out.println("Postincrement : " + (a++));
     System.out.println("The value of a is after applying post increment Operator = "+a);
     
     System.out.println("The value of a is before applying pre increment Operator = "+a);
     System.out.println("Preincrement : " + (++a));
     System.out.println("The value of a is after applying pre increment Operator = "+a); 
     
     System.out.println("The value of a is = "+a);

     	System.out.println("Postdecrement : " + (a--));       
       System.out.println("Predecrement : " + (--a));
 }
}
