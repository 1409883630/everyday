//��дһ������ʵ��n��k�η���ʹ�õݹ�ʵ�֡�
#include<stdio.h>
int sqrt(int n,int k)
{
	if (k ==  0)
	{
		return 1;
	}
	else if (k>=1)
	{
		return n*sqrt(n, k - 1);
	}
}
int main()
{
	int a,b;
	scanf("%d %d", &a, &b);
	printf("%d\n", sqrt(a, b));
	return 0;
}