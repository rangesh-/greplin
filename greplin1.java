import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class greplin1 {

	public static void main(String args[])
	{
	InputStreamReader input=new InputStreamReader(System.in);  
	BufferedReader inputs=new BufferedReader(input);
	try {
		String inps=inputs.readLine();
		int len=-9;
		String subString,revsubString,output = null;
		for(int i=0;i<(inps.length());i++)      //generating combinations and finding substring
		{
		for(int j=1;j<=(inps.length()-i);j++)
		{
			subString=inps.substring(i,(j+i));
		revsubString=new StringBuffer(subString).reverse().toString();
			if((subString).equalsIgnoreCase(revsubString) && ((subString.length()))>len) // palindrome check
			{
				//System.out.println("Substring is :"+subString);
				output=subString;
				len=output.length();
			}
		}
		}
		System.out.println("Longest Palindrome:"+output);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
