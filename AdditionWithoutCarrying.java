int additionWithoutCarrying(int param1, int param2) {
    int sum=0,c=1;
    while(param1!=0 || param2!=0)
        {
            sum=((param1%10+param2%10)%10)*(c)+sum;
            param1=param1/10;
            param2=param2/10;
            c=c*10;
        }
    return sum;
}
