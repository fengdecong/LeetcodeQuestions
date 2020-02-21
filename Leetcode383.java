//给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
//判断第一个字符串ransom能不能由第二个字符串magazines里面的字
//符构成。如果可以构成，返回 true ；否则返回 false。
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
		int b[]=new int[26];
		for(char c:magazine.toCharArray()){
			b[c-'a']++;
		}
		for(char c:ransomNote.toCharArray()){
			if(b[c-'a']==0)
				return false;
			b[c-'a']--;
		}
		return true;    
    }
}