package programs;


import java.util.*;

public class PrimeFactorsCount 
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	System.out.println(factors(n));
	}
	
	static HashMap<Integer,Integer> factors(int n)
	{
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>(); 
//		if(n==2)
//		{
//			hash.put(n, 1);
//			return hash;
//		}
		
		int d = (int)Math.sqrt(n);
		
		for(int i=2;i<=d;i++)
		{
			System.out.println("asfkj");
			while(n%i==0)
			{
				if(hash.containsKey(i))
				{
					int val = hash.get(i)+1;
					hash.put(i, val);
					
				}
				else
					hash.put(i, 1);
				n=n/i;
			}
		}
		
		if(n>2)
		{
			if(hash.containsKey(n))
			{
				int val = hash.get(n)+1;
				hash.put(n, val);
				
			}
			else
				hash.put(n, 1);
			
		}
		
		return hash;
	}
	
	
	
}	
