import java.util.*;
import java.io.*;
class PlatWithNumbers {
public static void main(String args[] ) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
long mean;
StringTokenizer str = new StringTokenizer(br.readLine(), " ");
int n=Integer.parseInt( str.nextToken() );
int q=Integer.parseInt( str.nextToken() );
StringTokenizer arr = new StringTokenizer(br.readLine(), " ");
long[] prefixSum=new long[n];
prefixSum[0] = Integer.parseInt( arr.nextToken() );
for(int i=1;i<n;i++){
prefixSum[i]=prefixSum[i-1]+Integer.parseInt(arr.nextToken());
}
for(int j=0;j<q;j++)
{
StringTokenizer range = new StringTokenizer(br.readLine(), " ");
int l=Integer.parseInt( range.nextToken() );
int r=Integer.parseInt( range.nextToken() );
long d= r-l + 1;
if(l>1){
mean= ( prefixSum[ r - 1 ] - prefixSum[ l - 2 ] ) /d;
}
else{
mean= ( prefixSum[ r - 1 ] ) /d;
}
System.out.println(mean);
}
}
}