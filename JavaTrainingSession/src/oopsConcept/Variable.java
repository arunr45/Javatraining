package oopsConcept;

public class Variable {
	int a=10;
	int b=20;
	int c=30;
	int d=40;

	public static void main(String[] args) {
		Variable v=new Variable();
		v.sum();
		// TODO Auto-generated method stub

	}

	public void sum()
	{
		int sum;
		sum=a+b;
		System.out.println("The sum is");
		System.out.println(sum);
		
	}
	
	}

