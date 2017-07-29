package programs;
import java.util.*;
public class Prime {
	public static void main(String args[])
	{
	 Scanner scan = new Scanner(System.in);
	 int n = scan.nextInt;
	 int c =0;
	 ArrayList<Integer> primeList = new ArrayList<Integer>();
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 primeList.add(2);
	 list.add(2);
	 for(int i=3;i<=n;i++)
	 {
		 if(isPrime(i))
		 {
		 	primeList.add(i);
		 	list.add(i);
	 
		 }
	 }
	 
	 
	for(int i=0;i<primeList.size();i++)
	{
		for(int j = 0;j<primeList.size();j++)
		{
			String str = primeList.get(i).toString()+primeList.get(j);
			int in = Integer.parseInt(str);
			
			if(list.contains(in))
				c++;
			else
			{
				if(isPrime(in))
				{
					
					c++;
				}
			}
		}
	}
	
	System.out.println(c);
	 
	
	
	}

	private static Boolean isPrime(int i) {
		for(int j = 2;j<=Math.sqrt(i);j++)
		{
			if(i%j==0)
				return false;
		}
		return true;
		
	}
}