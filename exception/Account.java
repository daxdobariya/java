import java.util.*;

class Account
{
	private int ano,bal;
	private String bnm;

	void GetData()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Account Number:");
		ano=s1.nextInt();
		System.out.println("Enter Account Balance:");
		bal=s1.nextInt();
		System.out.println("Enter Account Branch Name:");
		bnm=s1.next();
	}

	void putData()
	{
		System.out.println("Account Number is : "+ano);
		System.out.println("Account Number "+ano+" Balance is : "+bal);
		System.out.println("Account Branch Name is : "+bnm);
	}

	void cradit(int b)
	{
		try
		{
			bal=bal+b;
		}
		catch(Myerrordemo1 e)
		{
			System.out.println("e.getMessage()");
		}
	}
	void dabit(int b)
	{
		try
		{
			if(b>bal)
				System.out.println("Balance is not Sufficient");
			else
				bal=bal+b;
		}
		catch(Myerrordemo1 e)
		{
			System.out.println("e.getMessage()");
		}
	}
	int getBal()
	{
		return bal;
	}
}