

 //不用加减乘除做加法。
 
 import java.util.*;
 public class Test {
    public int Add(int num1,int num2) {
        //按位与或的方法
        while(num2!=0){
            int swap=num1^num2;
            num2=(num1&num2)<<1;
            num1=swap;
        }
        return num1;
    }
}
