public class BulbGreedy 
{
   public static int bulbs(ArrayList<Integer> A) 
    {
     int press=0;
     for(int i=0;i<A.size();i++)
     {
        if(press%2!=0)
        {
        int x=(A.get(i)==1)?0:1;
            if(x==0)
            {
            press+=1;
            }
            if(x==1)
            {
                continue;
            }
        }
        else
        {
            if(A.get(i)==0)
            press+=1;
            else
            continue;
        }
     }
     return press;
    }
  public static void main(String args[])
  {
	Scanner obj = new Scanner(System.in);
	int n=obj.nextInt();
	List<Integer> li = new ArrayList<>();
	for(int i=0;i<n;i++)
	li.add(obj.nextInt());
	bulbs(li);
  } 
}
