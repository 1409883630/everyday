//����֮��
//����һ���������� nums ��һ������Ŀ��ֵ target��
//�����ڸ��������ҳ� ��ΪĿ��ֵ target  ���� ���� ���������������ǵ������±ꡣ
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