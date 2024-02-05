import java.util.*;
class AccMain
{
	public static void main(String args[])
	{
		int n,i;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter object Count");
		n=s1.nextInt();
		Account a1[]=new Account[n];
		for(i=0;i<n;i++)
		{
			a1[i]=new Account();
			a1[i].GetData();
		}
		for(i=0;i<n;i++)
		{
			a1[i].putData();
		}
	}
}