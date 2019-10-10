class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int need = target - num;
            if(map.containsKey(need)){
                return new int[] {map.get(need), i};
            }
            map.put(num, i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
