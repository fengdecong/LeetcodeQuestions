//找出最短无序连续子数组
//双指针
public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        int left = 0, right = -1;
        int max = nums[0], min = nums[length-1];
        for(int i = 0; i < length; i++){
            if(nums[i] < max){
                right = i;
            }
            else{
                max = nums[i];
            } 
            if(nums[length - i -1] > min) {
                left = length - i -1;
            }
            else {
                min = nums[length - i -1];
            }
        }
        return right-left+1;
    }