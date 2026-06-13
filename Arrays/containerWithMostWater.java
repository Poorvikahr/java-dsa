
  class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxWater=0;

        while(left<right){
         int w=right-left;
         int h=Math.min(height[left],height[right]);
         int area=w*h;

         maxWater=Math.max(area,maxWater);
        
        if(height[left]>height[right]){
            right--;
        }else{
            left++;
        }
        }
        return maxWater;
    }
}  

