//NC22 合并两个有序的数组
//给出一个整数数组 和有序的整数数组 ，请将数组 合并到数组 中，变成一个有序的升序数组 
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int curA = m-1,curB = n-1;
        int right = A.length-1;
        while(curA >= 0&& curB >= 0){
            if(A[curA] > B[curB]){
                A[right--] = A[curA];
                curA--;
            }else{
                A[right--] = B[curB];
                curB--;
            }
        }
         
        while(curA >= 0){
            A[right--] = A[curA];
            curA--;
        }
 
        while(curB >= 0){
            A[right--] = B[curB];
            curB--;
        }
    }
    }
