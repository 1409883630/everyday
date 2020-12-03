//实现函数判断year是不是润年
#include<stdio.h>
void leap(int x) //leap是判断闰年的函数
{
	if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0)
	{
		printf("%d是闰年\n", x);
	}
	else
	{
		printf("%d不是闰年\n", x);
	}
}
int main()
{
	int a;
	scanf("%d", &a);
	leap(a); //调用函数
	return 0;
}