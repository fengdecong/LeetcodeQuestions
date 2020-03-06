//长按输入
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int len_n = name.length();
        int len_t = typed.length();
        if(len_n > len_t){
            return false;
        } 
        int i = 0;
        int j = 0;
        while(i<len_n && j<len_t){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(j>0 && typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }else{
                return false;
            }
        }
        return i == len_n;
    }
}