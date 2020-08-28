package oopsConcept;

public class Testbank {

	public static void main(String[] args) {
		indianbank ind=new indianbank();
		ind.creditcard();
		ind.debitcard();
		ind.vehiclloan();
		ind.trip();
		System.out.println("Next Set of print");
		Usbank us=new indianbank();
		us.creditcard();
		us.debitcard();
		us.vehiclloan();
		ind.homeloan();
		System.out.println("Minimum balance"+Usbank.min_bal);
		
		
		// TODO Auto-generated method stub

	}

}
