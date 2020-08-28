package oopsConcept;

public class indianbank implements Usbank, brazilbank {
//is a relationship-Interface implements keywords
	//has a relationship-Extends keywords
	public void creditcard() {
		System.out.println("--Indianbank creditcard apply");
	}
	public void debitcard()
	{
		System.out.println("--indianbank debitcard apply");
	}
	public void vehiclloan()
	{
		System.out.println("--Indianbank vehicle apply");
	}
public void trip()
{
	System.out.println("---Indian Bank Trip Loan");
}
public void homeloan()
{
	System.out.println("---Indian Bank home Loan");
	}
}
