package oopsConcept;

public class StaticNonstatic {
	
	String name="arun";
	static int a=10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		StaticNonstatic.sum();
		StaticNonstatic obj=new StaticNonstatic();
		obj.sendmail();
		obj.sum();

	}
public void sendmail()
{
System.out.println("senmail is called");
}
public static void sum()
{
	System.out.println("sum is called");
}

}
