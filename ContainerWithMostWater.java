import java.util.*;
class Solution 
{
    public int maxArea(int[] height) 
    {
        int bor1=0;
        int bor2=height.length-1;
        int i=bor1;
        int j=bor2;
        int cap=0;
        int newcap=0;
        int newcap1=0;
        cap=(Math.min(height[bor1],height[bor2]))*(bor2-bor1);
        while(i<j)
        {
            if(height[i]<height[j])
            {
                newcap=(Math.min(height[i+1],height[bor2]))*(bor2-(i+1));
                newcap1=(Math.min(height[i+1],height[j]))*((j)-(i+1));
                if(newcap>=cap)
                {
                    bor1=i+1;
                    cap=newcap;
                }
                 else if(newcap1>=cap)
                {
                    bor1=i+1;
                     bor2=j;
                    cap=newcap1;                    
                }
                i++;
            }
            else if(height[i]>height[j])
            {
              newcap=(Math.min(height[bor1],height[j-1]))*((j-1)-(bor1));
              newcap1=(Math.min(height[i],height[j-1]))*((j-1)-(i));
              if(newcap>=cap)
                {
                    bor2=j-1;
                    cap=newcap;
                }  
                else if(newcap1>=cap)
                {
                    bor1=i;
                     bor2=j-1;
                    cap=newcap1;                    
                }
                j--;
            }
            else
            {
                if(height[i+1]>height[i])
                {
                    newcap=(Math.min(height[i+1],height[bor2]))*(bor2-(i+1));
                    if(newcap>=cap)
                    {
                    bor1=i+1;
                    cap=newcap;
                    }
                    i++;
                }
                else if(height[j-1]>height[j])
                {
                    newcap=(Math.min(height[bor1],height[j-1]))*((j-1)-(bor1));
                    if(newcap>=cap)
                    {
                    bor2=j-1;
                    cap=newcap;
                    }
                    j--;
                }
                else
                {
                    newcap=(Math.min(height[i+1],height[j-1]))*((j-1)-(i+1));
                    if(newcap>=cap)
                    {
                        bor1=i+1;
                        bor2=j-1;
                        cap=newcap;
                    i++;
                    j--;
                    }
                    else
                    {
                        i++;
                        j--;
                    }
                }
            }
        }
        return cap;
    }
}