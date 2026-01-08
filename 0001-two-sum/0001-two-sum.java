class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0;
        while(i < nums.length){
            int lookingFor = target-nums[i];
            if(map.containsKey(lookingFor)){
                return new int[]{
                    i,
                    map.get(lookingFor)
                };
            }
            map.put(nums[i] ,i);
                i++;
        }return new int[]{ -1,-1};
    }
}