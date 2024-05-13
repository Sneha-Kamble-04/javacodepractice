package Controlstatements;
import java.util.*;
public class Switchex 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your favourite Number 1 2 3 4");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("The value is 1");
			break;
			
		case 2:
			System.out.println("The value is 2");
			break;
			
		case 3:
			System.out.println("The value is 3");
			break;
			
		case 4:
			System.out.println("The value is 4");
			break;
		
		default:
			System.out.println("Invalid choice");
			
		}

	}

}
