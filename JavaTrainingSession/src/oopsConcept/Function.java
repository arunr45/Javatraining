package oopsConcept;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function div=new Function();
		int value=div.division(12,4);
		System.out.println("The value of d is"+value);
	}
public int division(int x,int y)
{
	int d;
	d=x/y;
	return d;
}
}
