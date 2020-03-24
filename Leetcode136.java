//只出现一次的数字
//给定一个非空整数数组，除了某个元素只出现一次以外，
//其余每个元素均出现两次。找出那个只出现了一次的元素。
//方法一 : 
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> mp = new TreeMap<>();
        for(Integer num : nums){
            mp.put(num,mp.getOrDefault(num,0) + 1);
        }
        for(int num : nums){
            if(mp.get(num) == 1)
                return num;
        }
        return -1;
    }
}

//方法二 :
class Solution {
    public int singleNumber(int[] nums) {
       int ret = 0;
       for(int num : nums)
           ret ^=num;
        return ret;
    }
}