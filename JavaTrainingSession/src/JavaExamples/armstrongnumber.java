package JavaExamples;

public class armstrongnumber {

	public void checkarmnumber(int numbertocheck)
	{
		int temp=numbertocheck;
		int sum=0;
		int reminder;
		while(numbertocheck>0)
		{
		reminder=numbertocheck%10;
		sum=sum+reminder*reminder*reminder;
		numbertocheck=numbertocheck/10;
	}
		if(sum==temp)
		{
			System.out.println("The number is an armstrong number");
		}
		else
		{
			System.out.println("The number is not an armstrong number");
		}
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		armstrongnumber arm=new armstrongnumber();
		arm.checkarmnumber(153);
		

	}

}
