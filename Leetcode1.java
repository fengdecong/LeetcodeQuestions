class Solution {
    public int[] twoSum(int[] nums, int target) {
		//先把数字和对应的下标存到哈希表中
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],i);
        }
		//遍历查找
        for(int i = 0;i < nums.length;i++){
            int num = target - nums[i];
            if(map.containsKey(num) && map.get(num) != i)
            return new int[]{i,map.get(num)};
        }
        throw new IllegalArgumentException("No two sum solution"); 
    }
}