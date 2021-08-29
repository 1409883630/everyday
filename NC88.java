//NC88 寻找第K大
//有一个整数数组，请你根据快速排序的思路，找出数组中第 大的数
import java.util.*;

public class Solution {
    public int findKth(int[] a, int n, int K) {
        // write code here
        //快速选择算法
        quickSort(a, 0, n - 1, K);
        return a[K - 1];
    }
    //从大到小排序
    private void quickSort(int[] arr, int left, int right, int k){
        if(left >= right){
            return;
        }
        int i = left, j = right;
        int tem = arr[left];
        //快排核心部分代码
        while(i < j){
            while(i < j && arr[j] <= tem){
                j--;
            }
            while(i < j && arr[i] >= tem){
                i ++;
            }
            swap(arr, i, j);
        }
        swap(arr, left, j);
        //舍弃判断
        if(k - 1 > j){
            quickSort(arr, j + 1, right, k);
        }else if(k - 1 < j){
            quickSort(arr, left, j - 1, k);
        }else{
            return;
        }
    }
     
    private void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
