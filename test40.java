
//  调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序.

import java.lang.String ;
 public class Main {
        public static void main(String[] args) {
            int []arr = new int[]{1,2,3,4,5,6};//定义一组数据
            order(arr);//方法调用
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]);
            }
        }
        public static void order(int[]arr) {
            int left = 0;
            int right =arr.length-1;
            while (left < right)
            {
                while ((left < right) && (arr[left] % 2 == 1))
                {
                    left++;//是奇数时，数组向右继续
                }
                while ((left < right) && (arr[right] % 2 == 0))
                {
                    right--;//是偶数时，数组向左继续
                }
                if (left < right)
                {
                    int tmp = arr[left];//当奇数在右边，偶数在左边，完成交换
                    arr[left] = arr[right];
                    arr[right] = tmp;
                }
            }
        }}
