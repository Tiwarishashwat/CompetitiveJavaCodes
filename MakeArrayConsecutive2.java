int makeArrayConsecutive2(int[] statues) {
    int ans=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
    for(int i=0;i<statues.length;i++)
    {
        if(min>statues[i]) min=statues[i];
        if(max<statues[i]) max=statues[i];
    }
    return (max-min+1)-statues.length;
}
