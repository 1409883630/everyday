//调整数组顺序使奇数位于偶数前面
class Solution {
    public int[] exchange(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int index = 0;
        for(int num : nums){
            if(num % 2 == 1){
                res[index++] = num;
            }
        }
        for(int num : nums){
            if(num % 2 == 0){
                res[index++] = num;
            }
        }
        return res;
    }
}