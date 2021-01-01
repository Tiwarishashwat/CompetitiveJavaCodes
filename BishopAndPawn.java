import java.util.*;
public class BishopAndPawn
{ 
public static boolean bishopAndPawn(String bishop, String pawn)
{
int bis1=bishop.charAt(0);
int bis2=Character.getNumericValue(bishop.charAt(1));
int pawn1=pawn.charAt(0);
int pawn2=Character.getNumericValue(pawn.charAt(1));
if(Math.max(bis1,pawn1)-Math.min(bis1,pawn1)==Math.max(bis2,pawn2)-Math.min(bis2,pawn2))
return true;
else
return false;
}
public static void main(String args[])
{
 Scanner obj = new Scanner(System.in);
 String bishop=obj.nextLine();
 String pawn=obj.nextLine();
 System.out.println(bishopAndPawn(bishop,pawn));
}
}
