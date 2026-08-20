class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length-1;
        int maxArea = 0;

        while(left < right ){

          int width = right - left;
          int currentArea = Math.min(heights[right],heights[left]) * width;

          if (heights[left] <= heights[right]){
            left ++;
          }else {
            right --;
          }

          maxArea = Math.max(currentArea,maxArea);

        }

        return maxArea;
    }
}
