package inheritance;

public class testcar {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();
		b.theftsafety();
		Car c=new Car();
		c.start();
		c.sop();
		c.refill();
		
		Car c1=new BMW();
		c1.start();
		c1.sop();
		c1.refill();
		b.engine();
		BMW b1=(BMW)new Car();
		
		//Only common methods in parent and child class plus all other methods in the parent class.
		
		
		// TODO Auto-generated method stub

	}

}
