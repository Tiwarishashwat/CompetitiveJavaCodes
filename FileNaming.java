import java.util.*;
class FileNaming
{
String[] fileNaming(String[] names) 
{
    for(int i=1;i<names.length;i++)
    {
        boolean check=presentPrevious(names,names[i],i);
        if(check) 
        {
            int k=findValueOfK(names,names[i],i,1);
            replace(names,i,k);
        }
    }
    return names;
}
boolean presentPrevious(String arr[], String value, int end)
{
    for(int i=0;i<end;i++)
    {
     if(arr[i].equals(value)) return true;   
    }
    return false;
}
int findValueOfK(String names[],String cur,int pos,int counter)
{
    String temp=cur+"("+counter+")";
    while(presentPrevious(names,temp,pos))
    {
     counter++; 
     temp=cur+"("+counter+")";  
    }
    return counter;
}
void replace(String names[],int pos,int k)
{
    names[pos]=names[pos]+"("+k+")";
}

 public static void main(String args[])
  {
        Scanner obj = new Scanner(System.in);
	int n=obj.nextInt();
	String names[]=new String[n];
	for(int i=0;i<n;i++)
	{
		names[i]=obj.nextInt();
	}
        System.out.println(fileNaming(names));
    }
}

