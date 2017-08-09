package programs;
import java.util.*;
public class SumOfTwo
{
	
	  public static void main(String args[])
	  {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    for(int i = 1;i<=n;i++)
	    {
	      int c = scan.nextInt();
	      int it = scan.nextInt();
	      int p[] = new int[it];
	       ArrayList<Integer> com = new ArrayList<Integer>();
	      for(int j = 0;j<it;j++)
	      {
	        p[j] = scan.nextInt();
	        if(com.contains(p[j]))
	        {
	          System.out.println("Case #"+i+": "+com.indexOf(p[j])+" "+j);
	          break;
	        }
	        else
	          com.add(c - p[j]);
	      }
	      
	     System.out.println(com);
	      
	    }
	  }
	
	
}
