class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int ans[]=new int[n];
        
        for(int i=n-k;i<n;i++){
            ans[i-(n-k)]=nums[i];
            
        }
        for(int i=k;i<n;i++){
            ans[i]=nums[i-k];
        }
         for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
        
    }
}