package programs;

import java.util.Arrays;

public class BinarySearch 
{
	public static void main(String[] args)
	{
		int[] a = {1,2,4,3,5,6};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a,3));
	}
}
