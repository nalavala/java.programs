package programs;

import java.util.ArrayList;
import java.util.List;

public class LexicalOrder {

	public static List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        int temp =10;
        int i =1;
     while(true)
     {
        if(n>=temp)
        { System.out.println(i);
            array.add(i);
            int j;
            for( j =temp;j<=n && j<temp+10;j++)
            {
            	System.out.println(j);
                array.add(j);
            }
            if(j>n ||temp >n)
                break;
            temp+=10;
            i+=1;
        }
     }
        System.out.println(temp);
      
            int r =temp/10;
             for(int k = r+1;k<=9;k++)
             {
            	 System.out.println(k);
                 array.add(k);
             }
                 
         
     
     return array;
        
    }
	
	public static void main(String[] args)
	{
		System.out.print(lexicalOrder(99));
	}
}
