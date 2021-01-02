import java.util.*;
class Anagrams
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        while(t>0)
        {
            String a=obj.next();
            String b=obj.next();
            int counter=0;
            HashMap<Character,Integer> hm= new HashMap<>();
            for(int i=0;i<a.length();i++)
            {
                if(hm.containsKey(a.charAt(i)))
                {
		            hm.put(a.charAt(i),hm.get(a.charAt(i))+1);
                }
		        else
		        {
                    hm.put(a.charAt(i),1);
		        }
            }
            for(int i=0;i<b.length();i++)
            {
                if(hm.containsKey(b.charAt(i)))
                {
		            if(hm.get(b.charAt(i))==0)
		            {
                      counter++;
		              hm.remove(b.charAt(i));
		            }
                    else
		            {
                      hm.put(b.charAt(i),hm.get(b.charAt(i))-1);
		            }
                }
                else
                {
                    counter++;
                }
            }
            for (char i : hm.keySet()) 
            {
                counter+=hm.get(i);
            }
            System.out.println(counter);
            t--;
        }
    }
}
