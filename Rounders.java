int rounders(int n) {
    String str="";
    str+=n;
    int i=0,j=str.length()-1;
    while(j>i)
    {
        int x=Character.getNumericValue(str.charAt(j));
        if(x<5)
        {
            str=str.substring(i,j)+0+str.substring(j+1);
        }
        else
        {
            str=str.substring(i,j-1)+(Character.getNumericValue(str.charAt(j-1))+1)+0+str.substring(j+1);
        }
        j--;
    }
return Integer.parseInt(str);
}
