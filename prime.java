// CREATE A METHOD WHICH IS ACCEPTING INTEGER TYPE DATA
// IF THE NUMBER IS PRIME NUMBER PRINT 1
// IF THE NUMBER IS NOT PRIME NUMBER PRINT -1

import java.util.Scanner;

class prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the number = ");
		int n = sc.nextInt();
		prime(n);
	}
	
	public static void prime(int n)
	{
		int count=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println("1");
		}
	}
}