int mirrorBits(int a) 
{
String st="";
while(a!=0)
{
    st=st+a%2;
    a=a/2;
}
return Integer.parseInt(st,2);
}
