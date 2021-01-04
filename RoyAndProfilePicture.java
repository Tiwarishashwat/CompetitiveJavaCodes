import java.util.*;
class RoyAndProfilePicture
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int L=obj.nextInt();
        int n=obj.nextInt();
        while(n>0)
        {
            int w=obj.nextInt();
            int h=obj.nextInt();
            String message="";
            if(w>=L && h>=L)
            {
                if(w==h)
                {
                    message="ACCEPTED";
                }
                else
                {
                    message="CROP IT";
                }
            }    
            else
            {
                message="UPLOAD ANOTHER";
            }        
            System.out.println(message);
            n--;
        }
    }
}
