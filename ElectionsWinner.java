import java.util.*;
class ElectionsWinner
{
static int electionsWinners(int[] votes, int k)
{
  int ans=0,currMax=0,counter=0;
  for(int i=0;i<votes.length;i++)
  {
      if(votes[i]>currMax)
      {
        currMax=votes[i];
        counter=0;
      }
      if(votes[i]==currMax)
      counter++;
  }
  if(counter==1)
   ans=1;
  for(int i=0;i<votes.length;i++)
  {
      if(votes[i]==currMax && counter==1)
      continue;
      if(votes[i]+k>currMax)
      {
        ans++;
      }
  } 
   return ans;
}

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
	int n=obj.nextInt();
	int votes[]=new int[n];
	for(int i=0;i<n;i++)
	votes[i]=obj.nextInt();
	int k=obj.nextInt();
        System.out.println(electionsWinners(votes,k));
    }
}

