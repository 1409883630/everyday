//NC17 ������Ӵ�
//����һ���ַ����������һ����Ч�㷨����������������Ӵ��ĳ��ȡ�
//�����ַ���A�Լ����ĳ���n���뷵��������Ӵ��ĳ��ȡ�
import java.util.*;
public class Solution {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        char[] a = A.toCharArray();
        int res = 0;
        for(int i = 0; i < a.length; i++){
            int b1 = soild(a,i,i);
            int b2 = soild(a,i,i+1);
            res = res > b1 ? res : b1;
            res = res > b2 ? res : b2;
        }
        return res;
        
    }
    
    int soild(char[] a ,int i, int j){
        while(i >= 0 && j < a.length && a[i] == a[j]){
            i--;
            j++;
        }
        return j-i-1;
    }
}