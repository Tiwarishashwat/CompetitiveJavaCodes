import java .util.*;
class BaloonBurst
{
 public static int EkVaariAaTohShi(int intervals[][])
 {
  if(intervals==null || intervals.length==0) return 0;
  //Sort the 2d array according to the ending dimenstion
  Arrays.sort(intervals,(a,b)->(a[1]-b[1]));
 int arrowPos = intervals[0][1];
 int arrowCnt=1;
 for(int i=1;i<intervals.length;i++)
 {
   if(intervals[i][0]<=arrowPos)
   {
     continue;
   }
   arrowCnt++;
   arrowPos = intervals[i][1];
 }
   
  return arrowCnt;
 }
 public static void main(String args[])
 {
  Scanner obj = new Scanner(System.in);
  int n=obj.nextInt();
  int c=obj.nextInt();
  int arr[][]=new int[n][c];
  for(int i=0;i<n;i++)
  {
   arr[i][0]=obj.nextInt();
   arr[i][1]=obj.nextInt();
  }
  System.out.println(EkVaariAaTohShi(arr));
 }
}
