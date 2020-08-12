public static int[] searchRange(int[] nums, int target) {
        int left = 1;
        int right = nums.length;
        int start = 0;
        int end = 0;
		//利用二分查找确定一个target的位置
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid-1] == target){
                start = mid;
                end = mid;
                break;
            }
            else if(left == mid && right == mid && nums[mid-1] != target) {
                return new int[]{-1, -1};
            }
            else if(nums[mid-1] < target){
                left = mid + 1;
            }
            else if(nums[mid-1] > target){
                right = mid - 1;
            }
        }
		//以之前找到的target位置为分界线 向两边进行二分查找 
		//用start和end 进行标记  然后找到最终区间下标
        int lowA = 1;
        int highA = start;
        int lowB = end;
        int highB = nums.length;
        while (lowA <= highA) {
            int midA = (lowA + highA) / 2;
            if (nums[midA-1] == target) {
                start = midA;
                highA = start - 1;
            } else {
                lowA = midA + 1;
            }
        }
        while (lowB <= highB) {
            int midB = (lowB + highB+1) / 2;
            if(midB == 0) break; //防止midB==0,在进行-1而造成数组下标越界
             else if (nums[midB-1] == target) {
                end = midB;
                lowB = end + 1;
            } else {
                highB = midB - 1;
            }
        }
        return new int[]{start-1,end-1};
    }
}