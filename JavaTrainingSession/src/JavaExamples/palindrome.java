package JavaExamples;

public class palindrome {
	
	public void palinchek(int numbertocheck)
	{
		
		
        int sum=0;
        int reminder;
        
        int temp=numbertocheck;
        while(numbertocheck>0)
        {
        	reminder=numbertocheck%10;
        	sum=(sum*10)+reminder;
        	numbertocheck=numbertocheck/10;
        	System.out.println("The number is "+sum);
        	
        	
        }
        
        if(temp==sum)
        {
        	System.out.println("The number is palindrome");
        	
        }
		
        else
        {
        	System.out.println("The number is not palindrome");
        }
	}

	public static void main(String[] args) {
		
		palindrome p=new palindrome();
		p.palinchek(1221);
		// TODO Auto-generated method stub

	}

}
