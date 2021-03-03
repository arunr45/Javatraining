package JavaBasics;

import java.util.Iterator;
import java.util.LinkedList;

public class Linklist {

	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.add("test");
		ls.add("QTP");
		ls.add("Selenium");
		ls.add("RPA");
		System.out.println("Contents of linkedlist are"+ls);
		
		ls.addFirst("Maneesh");
		ls.addLast("varun");
		System.out.println("Contents of linkedlist after adding few itesm are"+ls);
		// TODO Auto-generated method stub
System.out.println(ls.get(0));
System.out.println(ls.get(1));
ls.set(0, "Tom");
System.out.println(ls.get(0));
ls.removeFirst();
ls.removeLast();
System.out.println(ls.get(0));
System.out.println("Contents of linkedlist are"+ls);
System.out.println("Using for loop::Contents of linkedlist are");
for(int m=0;m<ls.size();m++)
{
	System.out.println(ls.get(m));
}
System.out.println("Using iterator::Contents of linkedlist are");
Iterator it=ls.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
	
	}
Iterator it1=ls.iterator();


	}

}
