package oopsConcept;

public class Car extends Vehicle{
	
	int mod;
	String wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		a.mod=2015;
		b.mod=2013;
		c.mod=2012;
		
		a.wheel="maruti";
		b.wheel="BMW";
		c.wheel="Jeep";
		
 System.out.println(a.wheel);
 System.out.println(b.wheel);
 System.out.println(c.wheel);
 System.out.println(a.mod);
 System.out.println(b.mod);
 System.out.println(c.mod);
 System.out.println("After assigning");
 a=b;
 b=c;
 c=a;
 a.mod=10;
 System.out.println("Valu of a" +a.mod);
 c.mod=30;
 System.out.println("Valu of a" +a.mod);

 
}

}
