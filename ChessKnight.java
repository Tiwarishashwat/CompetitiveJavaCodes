import java.util.*;
class ChessKnight
{
int chessKnight(String cell)
{
    int moves=0;
    char ch1=cell.charAt(0);
    char ch2=cell.charAt(1);
    moves+=directions((char)(ch1+1),(char)(ch2+2));
    moves+=directions((char)(ch1+1),(char)(ch2-2));
    moves+=directions((char)(ch1+2),(char)(ch2+1));
    moves+=directions((char)(ch1+2),(char)(ch2-1));
    moves+=directions((char)(ch1-1),(char)(ch2+2));
    moves+=directions((char)(ch1-1),(char)(ch2-2));
    moves+=directions((char)(ch1-2),(char)(ch2+1));
    moves+=directions((char)(ch1-2),(char)(ch2-1));
    return moves;
}
static int directions(char ch1,char ch2)
{
    if((ch1>=97 && ch1<=104) && (ch2>=49 && ch2<=56))
        return 1;
    else 
        return 0;
}


    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
	String str = obj.next();
        System.out.println(chessKnight(str));
    }
}

