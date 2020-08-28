package JavaBasics;
import java.io.*;
import java.util.*;
public class ArrayListTheme {

	public static <E> void main(String[] args) 
    { 
		ArrayList ar=new ArrayList();//Default class
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println("The size of array is "+ar.size());
		System.out.println("The element at the position is "+ar.get(3));
		ArrayList<Integer> ar1=new ArrayList<Integer>();//generics concepts in java
		ar1.add(120);
		
		ArrayList<E> ar2=new ArrayList<E>();
		//Creating employee list
		employee emp1=new employee("naveen",27,"QA");
		employee emp2=new employee("arun",27,"QA");
		employee emp3=new employee("arun",27,"QA");
		
		//Adding employee objects to arraylist
		ArrayList<employee> ar5=new ArrayList<employee>();
		ar5.add(emp1);
		ar5.add(emp2);
		ar5.add(emp2);
		
		//Using iterator to iterate
		
	Iterator<employee> it=ar5.iterator();
	while(it.hasNext())
	{
		employee emp=it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
	}
    
	
	ArrayList<Integer> ar10=new ArrayList<Integer>();//generics concepts in java
	ar10.add(100);
	ar10.add(200);
	System.out.println("Adding 2 arraylist**************");
	
	ArrayList<Integer> ar11=new ArrayList<Integer>();//generics concepts in java
	ar11.add(300);
	ar11.add(400);
	
	ar10.addAll(ar11);
	for(int i=0;i<ar10.size();i++)
	{
		
		System.out.println(ar10.get(i));
	}
	
	System.out.println("Removing arraylist**************");
	ar10.removeAll(ar11);
	for(int i=0;i<ar10.size();i++)
	{
		
		System.out.println(ar10.get(i));
	}
	
	System.out.println("Common areas**************");
	ar10.retainAll(ar11);
	for(int i=0;i<ar10.size();i++)
	{
		
		System.out.println(ar10.get(i));
	}
	
	
	
	
	}
	
	
    }
	
	
