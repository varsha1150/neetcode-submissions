class Solution {
    public int maxProfit(int[] prices) {
        int maxsum=0;
        int min=Integer.MAX_VALUE;
       
        for (int i=0;i<prices.length;i++){
            if(prices[i]<min) min=prices[i];
            else{int cursum=prices[i]-min;
            if (cursum>maxsum) maxsum=cursum;}
            
            

        }
        return maxsum;
        }
        
    }
