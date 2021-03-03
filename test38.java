public class Main {
 /./ 一组数据，只有一个数字是出现一次，其他是两次，
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5,5};
         ss(arr);
    }

    public static void ss(int[]a){
        for(int i=0;i<a.length;i++){
            int count =0;//通过判断出现次数来解决
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }}
                if (count == 1) {
                    System.out.println("只出现一次的数字"+a[i]);
                }
            }

        }
    }
