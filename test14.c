
//递归方式实现打印一个整数的每一位
#include<stdio.h>
void find(int x)//构造递归函数，递归函数就是自己调用自己
{
	if (x < 10)
	{
		printf("%d\n", x);
	}
	else
	{
		find(x / 10);//这里函数调用在前，没打印，都在栈里堆积着，栈的原则是先进后出，所以出栈打印时与进栈相反。
		//比如输入1234，按照模除的概念依次存进栈4 3 2 1，输出1 2 3 4；  
		printf("%d\n", x % 10);
	}
}
int main()
{
	int a;
	scanf("%d", &a);
	find(a);
	return 0;
}