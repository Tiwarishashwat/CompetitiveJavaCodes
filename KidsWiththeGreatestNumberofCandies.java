class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int getMax=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
            getMax=Math.max(candies[i],getMax);
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=getMax) res.add(true);
            else res.add(false);
        }
        return res;   
    }
}
