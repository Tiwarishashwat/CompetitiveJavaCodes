import java.util.*;
class DigitsProduct
{
int digitsProduct(int product)
{
    if(product==0) return 10;
    else if(product<=9) return product;
    int smallPos=0;
    while(product>9)
    {
        int orig=product;
        for(int f=9;f>1;f--)
        {
         if(product%f==0)  
         {
             int kl=product/f;
             kl=digitsProduct(kl);
             if(kl==-1) return -1;
             smallPos=smallPos*10+kl;
             product=f;
             break;
         } 
        }
        if(product==orig) return -1;
    }
    return smallPos*10+product;
}
 public static void main(String args[])
  {
        Scanner obj = new Scanner(System.in);
	int n=obj.nextInt();
        System.out.println(digitsProduct(n));
    }
}

