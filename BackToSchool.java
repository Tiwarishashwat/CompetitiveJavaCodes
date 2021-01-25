import java.util.*;
import java.io.*;
class BackToSchool
{
    public static void main(String args[])  throws Exception
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String st[]=br.readLine().trim().split(" ");
    int x=Math.max(Integer.parseInt(st[0]),Integer.parseInt(st[1]));
    System.out.println(Math.max(x,Integer.parseInt(st[2])));
    }
}
