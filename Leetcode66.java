//加一
class Solution {
    public int[] plusOne(int[] digits) {
        int n = 0;
        for(int i = digits.length - 1;i >= 0;i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
                n++;
            }
        }
        if(n == digits.length){
            digits = new int[digits.length+1];
            digits[0] = 1;
            return digits;
        }
        return digits;
    }
}