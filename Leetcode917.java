//反转字母
class Solution {
    public String reverseOnlyLetters(String S) {
        char[] A = S.toCharArray();
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            while (i < j && (A[i] < 'A' || A[i] > 'Z') && (A[i] < 'a' || A[i] > 'z')) i++;
            while (i < j && (A[j] < 'A' || A[j] > 'Z') && (A[j] < 'a' || A[j] > 'z')) j--;
            if (i < j) {
                A[i] ^= A[j];
                A[j] ^= A[i];
                A[i++] ^= A[j--];
            }
        }
        return String.valueOf(A);
    }
}