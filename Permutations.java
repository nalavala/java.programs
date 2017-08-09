package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Permutations {
	
	public static void main(String[] args)
	{
		/*int array[] = {1,2,3,4};
		String str = Arrays.toString(array);
		
		str= str.replace(""+',',"");
		
		str = str.replace(" ","");
		
		str=str.replace(""+'[',"");
		str=str.replace(""+']',"");
		System.out.println(str.charAt(2));*/
	    Scanner scan = new Scanner(System.in);
	    System.out.println("enter the string");
	    String str=scan.nextLine();
	    char[] str1=str.toCharArray();
		//System.out.println(str);
		permutation(str1,0,str1.length);
		//System.out.println(str);
		
	}

	private static void permutation(char[] str, int i, int length) {
		
		
		
		if(i==length-1)
			System.out.println(str);
		else
		{
			for(int j = i;j<length;j++)
			{
				if(j== 3 && i ==0)
					continue;
				else
				{
				swap(str,i,j);
				
				permutation(str,i+1,length);
				swap(str,i,j);
				}
				
			}
		}
		
	}

	private static void swap(char[] str, int i, int j) {
		int array[] = {1,2,3,4};
		char temp;
		temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}

	
}
