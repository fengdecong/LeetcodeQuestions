//合并两个数组
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;
        int i = m - 1;
        int j = n - 1; 
        while (j >= 0){
            if (i < 0){
                nums1[index--] = nums2[j--];
            }else if (nums1[i] >= nums2[j]){
                nums1[index--] = nums1[i--];
            }else{ // nums1[i] < nums2[j]
                nums1[index--] = nums2[j--];
            }
        }
    }
}