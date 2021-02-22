int[] firstReverseTry(int[] arr) {
    if((arr==null)||(arr.length<=1)) return arr;
    int temp=0;
    temp=arr[0];
    arr[0]=arr[arr.length-1];
    arr[arr.length-1]=temp;
    return arr;
}
