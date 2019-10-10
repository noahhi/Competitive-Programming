class Solution {
    public int maxArea(int[] height) {
        int left,right;
        left = 0; 
        right = height.length-1;
        int max = 0;
        while(left != right){
            int area = (right-left)*Math.min(height[right], height[left]);
            max = Math.max(max, area);
            if(height[right] > height[left]){
                left++;
            } else {
                right--;
            }
        }
        return max; 
    }
}
