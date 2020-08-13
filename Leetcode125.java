//验证回文串
public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        String str = s.toLowerCase();  //因为不分大小写所以,先将字符串中的字母全部置为小写
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
			//isLetterOrDigit() 判断是否是数字或者字母的方法
            while(left < right &&!Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }