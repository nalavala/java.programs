package programs;

import java.util.*;
public class CountFactSumFactAndDivFact  {
    public static void main(String args[] ) throws Exception {
        
       
        long input =1000000000;
        
    	long maxD = (int)Math.sqrt(input);
        long sum=0;
        for(long i = 1; i <= maxD; i++)
        {
            if(input % i == 0)
            {
               sum += i;
               long d = input/i;
               if(d!=i)
                  sum+=d;
               System.out.println(i+"  "+d);
            }
        }
        System.out.println(sum);
}
}
