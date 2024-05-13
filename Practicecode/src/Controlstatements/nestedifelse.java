//Nested if else
package Controlstatements;

public class nestedifelse 
{

	public static void main(String[] args) 
	{
		int a=11; 
        int b=20; 
       if(a==10)//outer if block
       { 
    	   if(b==20)//inner if else
           { 
               System.out.println("GeeksforGeeks");// inner true statememnt 
           } 
           
           else
           { 
               System.out.println("GFG"); // inner false statement
           } 

       }

       else
       {
    	  System.out.println("Enter valid value"); // outer false stattement
       }
     }
}
