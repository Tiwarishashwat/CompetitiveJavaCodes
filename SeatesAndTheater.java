import java.util.*;
class SeatsAndTheater
{
int seatsInTheater(int nCols, int nRows, int col, int row) 
{
return(nCols-col+1)*(nRows-row);
}

public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int nCols=obj.nextInt();
int nRows=obj.nextInt();
int col=obj.nextInt();
int row=obj.nextInt();
System.out.println(seatsInTheater(nCols,nRows,col,row));
}
}
