/*在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个
二维数组和一个整数，判断数组中是否含有该整数。
*/
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0) return false;
        int n = matrix[0].length;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(matrix[i][j] > target){
                    break;
                }
                else if(matrix[i][j] == target){
                    return true;
                }
            }
        }
    return false;
    }
}