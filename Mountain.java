package programs;

import java.util.*;

public class Mountain {
	static long  c = 0;
	
	public static void main(String args[])
	{
	long temp = 1000000000+9;
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] array = new int[n];
	for(int i=0;i<n;i++)
	{
		array[i]=i+1;
	}
	
	//System.out.println(Arrays.toString(array));
	per(array,0,array.length);
	System.out.println(c%temp);
	}

	private static void per(int[] array, int i, int length) {
		if(i==length-1)
		{
			//System.out.println("kjcsl");
			print(array);
		}
		else
		{
			//System.out.println("kjcsl");
			for(int j = i;j<length;j++)
			{
				if(j==length-1 && i==0)
					continue;
				else
				{
				swap(array,i,j);
				
				per(array,i+1,length);
				swap(array,i,j);
				}
			}
		}
		
	}

	private static void print(int[] a) {
		Boolean t = false;
		int flag = 0;
		int i;
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				if(!t)
				{
					t=false;
					
				}
				else
				{
					flag = 1;
				    return;
				}
			}
			else
			{
				if(i!=0)
				{
				if(a[i]>a[i+1])
				{
					t = true;
					
				}
				}
				else
				{
					flag = 1;
				    return;
				}
			}
				
		}
		if(flag == 0 && (a[i]<a[i-1]))
		{
			//System.out.print(Arrays.toString(a));
			c++;
		}
		
	
	}

	private static void swap(int[] array, int i, int j) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}

}
