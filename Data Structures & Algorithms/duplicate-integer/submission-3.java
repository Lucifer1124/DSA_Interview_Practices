class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        } */
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            if(map.containsKey(nums[i]) == false){
                map.put(nums[i], 1);
            } else {
                return true;
            }
        }
        return false;
    }
}