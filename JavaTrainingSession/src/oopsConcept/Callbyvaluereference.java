package oopsConcept;

public class Callbyvaluereference {
	int p;
	int q;

	public static void main(String[] args) {
		Callbyvaluereference obj=new Callbyvaluereference();
		int c=obj.sum(10, 10);
		System.out.println("Sum is "+c);
		obj.p=50;
		obj.q=60;
		System.out.println("Before swap:Value of p"+obj.p);
		System.out.println("Before swap:Value of q"+obj.q);
		obj.swap(obj);
		System.out.println("After swap:Value of p"+obj.p);
		System.out.println("After swap:Value of q"+obj.q);
	}
		// TODO Auto-generated method stub

	
	
	public int sum(int a,int b)
	{
int c=a+b;
return c;
}
	public void swap(Callbyvaluereference t)
	{
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		}
	}
