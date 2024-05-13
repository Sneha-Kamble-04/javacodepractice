package Demo;
import java.util.*;
public class Demo3 
{

	public static void main(String[] args) 
	{	
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of a =");
		a=sc.nextInt();//nextInt()//It is used for read Integer Value 
		System.out.println("The value of a is ="+a);
		float f;
		System.out.println("Enter a value of f =");
		f=sc.nextFloat();//it used for take input decimal point  number
		System.out.println("The value of a is ="+f);
		char c;
		System.out.println("Enter a value of c =");
		c=sc.next().charAt(0);// it used read chararcter values
		System.out.println("The  value of c ="+c);
		String x;
		System.out.println("Enter a value of string x =");
		x=sc.nextLine();//it is used for read string values
		System.out.println("The  value of sring x is ="+ x);
		
		

	}

}
