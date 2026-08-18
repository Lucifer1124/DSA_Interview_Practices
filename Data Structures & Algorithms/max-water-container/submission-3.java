class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int left = 0; int right = heights.length - 1;
        while(left < right){
            int temp = Math.min(heights[left], heights[right]) * (right - left);
            area = Math.max(area, temp);
            if(heights[left] <= heights[right]){
                left++;
            } 
            else{
                right--;
            }
        }
        return area;
    }
}
/*int max = 0;
        int temp = 0;
        int left = 0; int right = heights.length - 1;
        while(left < right){
            if(heights[left] < heights[right]){
                temp = heights[left] * (right - left);
                left++;
            }
            else{
                temp = heights[right] * (right - left);
                right--;
            }
            if(max < temp){
                max = temp;
            }
        }
        return max; */

