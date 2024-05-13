package OOPSConcept;
class A1//PARENT CLASS 
{
	public void A()//Class A Functions
	{
		System.out.println("This is class A Parent");
	}
}
	
class B1 extends A1
{
	public void B()//Class B Function
	{
		System.out.println("This is a class B Child / This class is a Parent class of C class");
	}
}
public class C1 extends B1
{
	public void C()//Class C Function
	{
		System.out.println("This is a class C Child");
	}
		
	public static void main(String[] args) 
	
	{
		C1 b = new C1();
		b.A();
		b.B();
		b.C();

	}

}
