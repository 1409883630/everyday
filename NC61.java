//NC61 两数之和
//给出一个整数数组 numbers 和一个目标值 target，请在数组中找出两个加起来等于目标值的数，
//你给出的函数twoSum 需要返回这两个数字的下标（index1，index2）组成的数组，
//需要满足 index1 小于index2.。注意：下标是从1开始的
//保证给出的数组中只存在唯一解。
import java.util.*;
public class Solution {
    public int[] twoSum (int[] numbers, int target) {
        // write code here
         for(int i = 0; i<numbers.length; i++){
             for(int j = i+1; j<numbers.length; j++){
                 if(numbers[i] + numbers[j] == target){
                     return new int[]{i+1, j+1};
                     
    }
      }
         }
         return new int[0];
    }
     }
