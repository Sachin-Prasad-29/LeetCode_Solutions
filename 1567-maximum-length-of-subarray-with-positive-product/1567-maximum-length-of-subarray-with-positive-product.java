class Solution {
    public int getMaxLen(int[] nums) 
    {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            
            int negativeCount=0,
            positiveCount=0,
            firstNegative=-1,
            lastNegative=-1,
            j;
            for(j=i;j<nums.length;j++)
            {
                if(nums[j]<0)
                    negativeCount++;
                else if(nums[j]>0)
                    positiveCount++;
                else
                    break;
                if(nums[j]<0 && firstNegative==-1)
                    firstNegative=j;
                if(nums[j]<0)
                    lastNegative=j;
            }
            
            if(negativeCount%2==0)
                max=Math.max(positiveCount+negativeCount,max);
            else
                max=Math.max(max,Math.max(j-firstNegative-1,lastNegative-i));
            
            i=j;
            
        }
        return max;    
    }
}