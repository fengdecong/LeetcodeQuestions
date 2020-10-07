class Solution {
    public String replaceSpace(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for(int i = 0;i < length;i++){
            char c = s.charAt(i);
            if(c == ' '){
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0'; 
            }else{
                array[size++] = c;
            }
        }
		//将数组转化为字符串
        String str = new String(array,0,size);
        return str;  
    }
}