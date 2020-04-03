//按奇偶排序数组 不要求排序
class Solution {
    public int[] sortArrayByParity(int[] A) {
        for(int i = 0;i <= A.length-1;i++){
            if(A[i] % 2 ==0){
                int key = A[i];
                for(int a = i;a > 0; a--){
                    A[a] = A[a - 1];
                }
                A[0] = key;
            }
        }
        return A;
    }
}
