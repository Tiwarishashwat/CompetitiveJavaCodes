import java.util.*;
class ReachNextLevel
{
 boolean reachNextLevel(int experience, int threshold, int reward) 
 {
    return (experience+reward)>=threshold; 
 }
 public static void main(String args[])
 {
 Scanner obj = new Scanner(System.in);
 int e=obj.nextInt();
 int t=obj.nextInt();
 int r=obj.nextInt();
 System.out.println(ReachNextLevel(e,t,r));
 }
}