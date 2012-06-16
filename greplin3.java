import java.util.ArrayList;


public class greplin3 {
	static int count=0;
	public static void main(String args[])
	{
int  arr[]={3, 4, 9, 14, 15, 19, 28, 37, 47, 50, 54, 56, 59, 61, 70, 73, 78, 81, 92, 95, 97 ,99};
ArrayList<Integer> store=new ArrayList<Integer>();
int subset=1<<arr.length;	 
for(int i=0;i<subset;i++) // Bitwise Manipulation for subset Generation
{
int pos=(arr.length-1);	
int mask=i;
//System.out.print("{");
while(mask>0)
{
	if((mask &1)==1)
	store.add(arr[pos]);	
		mask>>=1;
pos--;

}
if(store.size()>1)
{
	int sum=0;
for(int j=0;j<store.size();j++)
{
sum=sum+store.get(j);	
}
System.out.println("Sum:"+sum);
for(int k=0;k<arr.length;k++) // Comparison the generated subset sum with array
{
if(sum==arr[k])
{
count=count+1;	// result
}
}
}
store.removeAll(store);
}
System.out.println("count:"+count);
	}

}
