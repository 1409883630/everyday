//给定一个整型数组, 实现冒泡排序(升序排序).
public class Main {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        b(arr, arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
    }

    public static int b(int arr[], int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return 0;
    }
}
