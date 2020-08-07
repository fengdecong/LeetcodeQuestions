class Solution {
    public int orangesRotting(int[][] grid) {
       int[][] arr = {{-1,0},{1,0},{0,-1},{0,1}};  //方向矩阵
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedBlockingQueue<>();
        //找出所有坏橘子
        for(int i = 0;i < row; i++){
            for(int j = 0;j < col; j++){
                if(grid[i][j] == 2)
                    q.add(new int[]{i,j});
            }
        }
        int minute = 0;
        while(!q.isEmpty()){
            boolean flag = false;
            //获取坏橘子数
            //         int code = q.remove();
            int size = q.size();
            for(int i = size;i > 0; i--){
                int[] orange = q.poll();
                int r = orange[0], c = orange[1];
                for(int j = 0;j < 4; j++){
                    int nr = r + arr[j][0];
                    int nc = c + arr[j][1];
                    //如果是新鲜橘子变坏入队
                    if(0 <= nr && nr < row && 0 <= nc && nc < col && grid[nr][nc] == 1){
                            flag = true;
                            grid[nr][nc] = 2;
                            q.add(new int[]{nr,nc});
                    }
                }
            }
            if(flag == true)
                minute++;
        }
        //判断剩下的橘子是否还有还有坏橘子
        for(int i = 0;i < row; i++){
            for(int j = 0;j < col; j++){
                if(grid[i][j] == 1)
                    return -1;
            }
        }
        return minute;
    }
}