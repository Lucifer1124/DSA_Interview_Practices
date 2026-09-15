class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = heights.length;
        int area = 0;
        for(int i = 0; i <= n; i++){
            while(!stack.isEmpty() && (i == n || heights[stack.peek()] > heights[i])){
                int length = heights[stack.pop()];
                int breath;
                if(stack.isEmpty()){
                    breath = i;
                }else{
                    breath = i - stack.peek() - 1;
                }  
                area = Math.max(area, length*breath);
            }
            stack.push(i);
        }
        return area;
    }
}
