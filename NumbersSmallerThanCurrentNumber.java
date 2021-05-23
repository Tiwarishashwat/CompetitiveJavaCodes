class Solution 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int max=0;
        int[] count = new int[102];
        for(int i=0; i<nums.length; i++)
        {
            count[nums[i]+1]++;
            if(max<nums[i]) max=nums[i];
        }

        for(int i=1; i<=max; i++) 
            count[i] += count[i-1];
        
        for(int i=0; i<nums.length; i++)
            nums[i] = count[nums[i]];
        
        return nums;
    }
}
    

    
