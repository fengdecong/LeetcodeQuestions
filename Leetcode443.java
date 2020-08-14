//压缩字符串
public int compress(char[] chars) {
    // write为写入指针; flag标注一段连续字符的起始位置;
      int flag = 0;
        int write = 0;
        for(int read = 0;read < chars.length; read++){
            // 当达到数组最后位置或连续字符的最后位置
            if(read + 1 == chars.length || chars[read+1] != chars[read]){
                chars[write++] = chars[flag];
                if(flag < read){
                    for(char c : ("" + (read - flag + 1)).toCharArray())
                        chars[write++] = c; 
                }
                flag = read + 1;
            }
        }
    return write;
    }