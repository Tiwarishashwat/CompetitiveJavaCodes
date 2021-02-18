boolean increaseNumberRoundness(int n) 
{
 int swtch=0;
 while(n!=0)
 {
     if(n%10!=0 && swtch==0) swtch=1;
     if(n%10==0 && swtch==1) return true;
     n=n/10;
 }
 return false;
}
