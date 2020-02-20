//移除数组元素 要求不能创建新的临时数组
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0;j < nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}