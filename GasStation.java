import java.util.*;
public class GasStation {
    public static int canCompleteCircuit(List<Integer> A,List<Integer> B) 
    {
        int cal=0,sum1=0,sum2=0;
        for(int i=0;i<A.size();i++)
        {
            sum1=sum1+A.get(i);
            sum2=sum2+B.get(i);
        }
        if(sum1<sum2)
        return -1;
        int s=0;
        int curr=0;
        for(int i=0;i<A.size();i++)
        {
            curr=curr+A.get(i)-B.get(i);
            if(curr<0)
                {
                    s=i+1;
                    curr=0;
                }
    
        }
        return s;
    }
	public static void main(String args[])
	{
	  Scanner obj = new Scanner(System.in);
	  int n=obj.nextInt();
	  List<Integer> A=new ArrayList<>();
	  List<Integer> B=new ArrayList<>();
	  for(int i=0;i<n;i++)
       	  {
	    System.out.println("Enter value of A");
	    A.add(obj.nextInt());
	    System.out.println("Enter value of B");
	    B.add(obj.nextInt());
	  }
	System.out.println(canCompleteCircuit(A,B));
	} 
}
