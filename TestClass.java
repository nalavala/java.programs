package programs;


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
    Scanner scan = new Scanner(System.in);
   // int n = scan.nextInt();
    int a[] = {5,2,3,2,5,3,8,9,5,2};
   /* long a[] = new long[n];
    for(int i = 0;i<n;i++)
    {
        a[i] = scan.nextInt();
        a[i] = danger(a[i]);
    }*/
   
   
   
   
   
    long q = scan.nextInt();
    for(int i =1;i<=q;i++)
    {
    	HashSet hash = new HashSet();
    	int c =0;
        int l = scan.nextInt();
        int r = scan.nextInt();
        for(int j =l;j<=r;j++)
        {
        	if(!hash.add(a[j-1]))
        	{
        		hash.remove(a[j-1]);
        		c++;
        		
        	}
        	
        }
        System.out.println(c);
    }
        
    }
    
  /*  static long[] findDanger(long[] at)
    {
    	
        for(int i =0;i<at.length;i++)
        {
            long temp = danger(at[i]);
            at[i] = temp;
        }
       
        return at;
    }*/
    
    static long danger(long n)
    {
    	
        long dangerVal = 0;
        long i =1;
       
       
        while (i <= Math.sqrt(n))
        {
            if(n%i==0){
                dangerVal++;
                if(i!=Math.sqrt(n))
                dangerVal++;
                
            }
                
            i++;
        }
        return dangerVal;
    }
}

