package JavaBasics;

public class DataTypes {

	//main() method is the starting of the execution point of the program.
	//static-When java runtime starts, there is no object of the class present. That’s why the main method has to be static so that JVM can load the class into memory and call the main method. If the main method won’t be static, JVM would not be able to call it because there is no object of the class is present. Let’s see what happens when we remove static from java main method.
	//String[] args-Java main method accepts a single argument of type String array. This is also called as java command line arguments. Let’s have a look at the example of using java command line arguments.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// primitive data types
		
		int i=10;
		int j=30;
		System.out.println(j);
		int k=40;
		int l=-1;
		int p=0;
		
		double d=12.33;
		double d1=34.44;
		System.out.println(d1);
		double d2=100;
		
		char c='a';
		char c1='A';
		char C2='1';
		char c3='$';
		
		boolean b1=true;
		boolean b2=false;
		
		//string is a class NOT a datatype
		
		String s="Hello World";
		String s1="Selenium";
		String s2="Hi this is my java code";
		String s3="1000";
		

	}

}
