class Solution {
    public String reverseWords(String s) {
        String rev="";
        int i=s.length()-1;
        while(i>=0)
        {
        while(i>=0 && s.charAt(i)==' ') i--;
        int j=i;
        if(i<0) break;
        while(i>=0 && s.charAt(i)!=' ') i--;
        if(rev.isEmpty())
            {
            rev+=s.substring(i+1,j+1);
            }
        else
            {
            rev+=" "+s.substring(i+1,j+1);
            }
        }
       
        return rev;
    }
}