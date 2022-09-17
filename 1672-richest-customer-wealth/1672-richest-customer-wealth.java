class Solution {
    public int maximumWealth(int[][] accounts) {
        // person=row;
        //account=col;
        int Max=Integer.MIN_VALUE;
        for(int[] ints :accounts){
             int wealth=0; 
         
        for(int intss :ints){
          
            wealth+=intss;
            
            
        }  
            if (wealth > Max){
            Max=wealth;
        }
            
        }
        
          
        
        return  Max;
    }
    
}