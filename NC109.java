//NC109 ��������
//��һ��01����1������½�أ�0������ �������1���ڣ���ô������1����ͬһ������
//����ֻ������������Ϊ���ڡ�
//����: ����½�ؿ������һ�����죨����:�������ң� �жϵ��������
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