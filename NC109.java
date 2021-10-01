//NC109 岛屿数量
//给一个01矩阵，1代表是陆地，0代表海洋， 如果两个1相邻，那么这两个1属于同一个岛。
//我们只考虑上下左右为相邻。
//岛屿: 相邻陆地可以组成一个岛屿（相邻:上下左右） 判断岛屿个数
import java.util.*;
public class Solution {
    public int solve (char[][] grid) {
        // write code here
         int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    res++;
                }
            }
    }
        return res;
    }
        public void dfs(char[][] matrix,int i,int j){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == '0')
            return;
        matrix[i][j] = '0';
        dfs(matrix,i+1,j);
        dfs(matrix,i-1,j);
        dfs(matrix,i,j+1);
        dfs(matrix,i,j-1);
    }
}
