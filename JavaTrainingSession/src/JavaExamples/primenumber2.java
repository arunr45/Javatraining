package JavaExamples;

public class primenumber2 {
	
	public static boolean isprime(int number)
	{
		if(number<=1)
		{
			return false;
		}
		
		else
		{
			for(int i=2;i<=number;i++)
			{
				if(number%i==0)
				{
					return false;
				}
				else
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("22 is a prime number"+ isprime(22));

}}
