package oopsConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(5);
		obj.sum("arun");

	}
	
	public void sum()
	{
		System.out.println("Zero parameter");
	}
public void sum(int i)
{
	System.out.println("One data input parameter");
	System.out.println(i);

	}

public void sum(String s)
{
	System.out.println("one string parameter");
	System.out.println(s);
}
}
