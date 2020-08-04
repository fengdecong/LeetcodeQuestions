//第三大的数
//给定一个非空数组，返回此数组中第三大的数。
//如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int[] arr = new int[set.size()];
        int a = 0;
        for(int j:set){
            arr[a++] = j;
        }
        Arrays.sort(arr);
        if(arr.length < 3){
            return arr[arr.length-1];
        }
        if(arr.length >= 3){
            return arr[arr.length-3];
        }
        return -1;
    }
}