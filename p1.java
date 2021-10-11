//两数之和
//给定一个整数数组 nums 和一个整数目标值 target，
//请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//任意返回一个下标都可以。
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
         for(int i=0;i<nums.length;i++){
             int res=nums[i];
             for(int j=i+1;j<nums.length;j++){
                 if(res+nums[j]==target){
                     a[0]=i;
                     a[1]=j;
                      return a;
             }
             }  
         }
         return a;
	}
}
