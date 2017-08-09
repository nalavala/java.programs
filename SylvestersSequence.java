package programs;

import java.util.*;
class SylvestersSequence {
    
	public static void main(String args[] ) throws Exception {
        
	       Scanner scan = new Scanner(System.in);
	       final long cont = 1000000000+7;
	       long[] a = new long[100001];
	       long[] b = new long[100001];
	       a[0] = 2;
	       a[1] = 3;
	       b[0] = 2;
	       b[1] = 6;
	       for(int j=2 ;j<=100000;j++)
	       {
	           a[j] = ((b[j-1]%cont)+1)%cont;
	           b[j] = ((a[j]%cont)*(b[j-1]%cont))%cont;
	        }
	        //System.out.println(Arrays.toString(a));
	        
	      /* long t = scan.nextInt();
	      
	       for(int i = 1 ;i<= t;i++)
	       {
	           long n = scan.nextInt();
	           for(int j =0;j<n;j++)
	                System.out.print(a[j]+" ");
	           System.out.println();
	       }
	       */
	        int T = scan.nextInt();
	            StringBuilder ans = new StringBuilder();
	            for (int t = 0; t < T; t++) {
	                int N = scan.nextInt();
	                for (int i = 0; i < N; i++) {
	                    ans.append(a[i]);
	                    if (i != N - 1) {
	                        ans.append(" ");
	                    }
	                }
	                ans.append("\n");
	            }
	            System.out.print(ans);
	           }
	
}
