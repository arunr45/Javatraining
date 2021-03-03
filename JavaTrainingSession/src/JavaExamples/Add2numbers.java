package JavaExamples;

import java.io.IOException;

public class Add2numbers {
	
	static int add(int x,int y)
	{
		 int sum=x+y;
		return sum;

	}

	public static void main(String[] args) throws IOException {
		int num1;
		int num2;
		
		System.out.println("Enter first number");
		 num1 = System.in.read();
	      System.out.println("You entered first number " + num1);
	      
	      System.out.println("Enter second number");
	      num2=System.in.read();
	      System.out.println("You entered second number " + num2);
	      
	
		int total=add(num1,num2);
		
		System.out.println("The sum is"+total);
		
		// TODO Auto-generated method stub

	}

}
