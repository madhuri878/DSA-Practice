class Solution {
    public int maximumWealth(int[][] accounts) {
        // person=row;
        //account=col;
        int Max=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
             int wealth=0; 
         
        for(int account=0; account<accounts[person].length;account++){
          
            wealth+=accounts[person][account];
            
            
        }  
            if (wealth > Max){
            Max=wealth;
        }
            
        }
        
          
        
        return  Max;
    }
    
}