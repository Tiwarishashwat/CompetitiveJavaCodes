int appleBoxes(int k) {
    int even=0,odd=0;
    for(int i=1;i<=k;i++)
    {
        if(i%2==0) even+=i*i;
        else odd+=i*i;
    }
return (even)-(odd);
}
