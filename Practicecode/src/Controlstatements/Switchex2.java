package Controlstatements;
import java.util.*;
public class Switchex2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("choice your fav color B-Black P-Pink G-Green");
		char c=sc.next().charAt(0);
		switch(c)
		{
		case 'B':
			System.out.println("You are fav color is Black");
			break;
		
		case 'P':
			System.out.println("You are fav color is Pink");
			break;
		
		case 'G':
			System.out.println("You are fav color is Green");
			break;
		
		default:
			System.out.println("invalid choice");
			
			
		}

	}

}
