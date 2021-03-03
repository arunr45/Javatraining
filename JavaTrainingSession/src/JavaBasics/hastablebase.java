package JavaBasics;
import java.util.*;
public class hastablebase
{
	public static void main(String args[])
			{
		Hashtable hm=new Hashtable();
		hm.put("Arun", 100);
		hm.put("sinil",200);
		System.out.println("The size of the heap is"+hm.size());
		System.out.println("value is "+hm.get("Arun"));
		
			}
}