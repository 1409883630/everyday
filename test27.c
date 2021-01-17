//实现一个对整形形状的冒泡排序。
#include <stdio.h>
void b(int arr[], int size)
{
	for (int i = 0; i < size - 1; i++)
	{
		for (int j = 1; j < size - i; j++)
		{
			if (arr[j - 1]>arr[j])
			{
				int tmp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = tmp;
			}
		}
	}
}
int main()
{
	int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
	b(arr, sizeof(arr) / sizeof(arr[0]));
	for (int i = 0; i < sizeof(arr) / sizeof(arr[0]); i++)
		printf("%d ", arr[i]);
	return 0;
}
