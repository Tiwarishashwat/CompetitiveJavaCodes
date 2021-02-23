int[] removeArrayPart(int[] inputArray, int l, int r) {
    int result[]=new int[inputArray.length-((r-l)+1)];
    for(int i=0;i<inputArray.length;i++)
    {
        if(i<l) result[i]=inputArray[i];
        else if(i>=l&&i<=r) continue;
        else result[i-((r-l)+1)]=inputArray[i];
    }
return result;
}
