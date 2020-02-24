//求最后一个单词的长度
//从右向做走 end走到第一个不是空格的字母处停下来并标记,
//end赋值statr,start继续走遇到第一个空格处停下来并标记,
//end - start就是长度
class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' ') end--;
        if(end < 0) return 0;
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ')start--;
        return end - start;
    }
}