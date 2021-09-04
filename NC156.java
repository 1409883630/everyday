//NC156 数组中只出现一次的数（其它数出现k次）
//给定一个长度为  的整型数组  和一个整数  。
//已知  中只有 1 个数出现一次，其他的数都出现  次。
//请返回只出现了 1 次的数。
import java.util.*;

public class Solution {
    public int foundOnceNumber (int[] arr, int k) {
        // write code here
        Arrays.sort(arr);
      for(int i = 0; i<arr.length-1; i++){
          if(arr[i]==arr[i+1]){
              i += k-1;
          }else{
              return arr[i];
          }
 
      }
      return arr[arr.length-1];
    }
}