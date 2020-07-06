package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		
		int a[]=new int[4];
		 a[0]=2;
		 a[1]=3;
		 a[2]=4;
		 a[3]=5;
		 
		 System.out.println(a[1]);
		
		 System.out.println(a[2]);
		 System.out.print("Size of array is: ");
		 System.out.println(a.length);
		System.out.println("the array is");
		 for(int i=0;i<=a.length-1;i++) {
			 
			 System.out.println(a[i]);
			 //Object array-To save different data types
			 //To overcome array size issue, we are using collections where we have ArrayList,Hash
			 Object obj[]=new Object[5];
			 obj[0]="Arun";
			 obj[1]=123;
			 obj[2]="Test data";
			 obj[3]="13/01/1985";
			 System.out.println("The size of array is "+obj.length);
			 for (i=0;i<=obj.length;i++)
			 {
			 System.out.println(obj[i]);
			 }
			 
			 
		 }
		// TODO Auto-generated method stub

	}

}
