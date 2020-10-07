/*在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个
数字重复了几次。请找出数组中任意一个重复的数字。*/

class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = -1;
        for(int i = 0;i < nums.length;i++){
            if(!set.add(nums[i])){
                n = nums[i];
                break;
            }
        }
    return n;
    }
}