import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class greplin2 {
	
	public static void main(String args[])
	{
	InputStreamReader input=new InputStreamReader(System.in);
	BufferedReader inputs=new BufferedReader(input);
	
	try {
		int in=Integer.parseInt(inputs.readLine());
		calculatefib(in);
	
		
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	static void calculatefib(int in)    //fibonocci generation
	{
	int f1=0,f2=1,f3=0;
	 int result=0;                       
	if(result!=1)
	{
	for(@SuppressWarnings("unused")
	int i=0;result!=1;i++)
	{
	f3=f2+f1;
	f1=f2;
	f2=f3;
	if(f3>in && result!=1)
	{
result=genprime(f3);

	}
	}
	}
	}
	static int genprime(int in) // prime number generation and prime Divisor Calculation
	{
		int s = 0;
		int count = 0;
		int sqrtin=(int)Math.sqrt(in);
		boolean [] check=new boolean[in+1];
		for(int i=2;i<=in;i++)
		{
		check[i]=true;	
		}
	for(int i=2;i<=sqrtin;i++)
	{
	if(check[i]==true)	                 //sieve of erithrosis
	{
		for(int j=(i*i);j<=in;j=(j+i))
		{
			check[j]=false;
		}
	}
	}
	for (int i = 1; i <= in; i++)
	{
	if((check[i]==true) )
	{
	if(i==in)
	{
	int in1=(in+1);	
	for(int k=1;k<=in;k++)
	{
		if(check[k]==true)           // prime divisors
		{
		if((in1%k)==0)
		{
			count=count+k;
		}
		}
	}
System.out.println("Next Nearest prime"+ i);
	System.out.println("Sum of Prime Divisor"+count);
	s=1;
	}
	}
	}
	
	return s;
	
	
	}

}
