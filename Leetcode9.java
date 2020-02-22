//回文数
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int i = 1;
        while(x / i >= 10){
            i *= 10;
        }
        while(x != 0){
            if((x / i) != (x % 10)){
                return false;
            }
            x = x % i / 10;
            i /= 100;
        }
        return true;
    }
}