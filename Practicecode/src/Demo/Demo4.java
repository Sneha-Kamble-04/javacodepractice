// Types of variables 1.Local variable 2.instance variable 3.static variable
package Demo;

public class Demo4 
{
	static int a=10;//Static variable
	public static void main(String[] args) 
	{	
		method();	
		int c=20;//instance varible
		System.out.println("The value of instance variable c is ="+c);
		
	}
	public static void method()
	{
		int b=10;//Local Variable
		System.out.println("The value of local variable b is ="+b);
		System.out.println("The value of Static variable a is ="+a);
	}
	
	

}
