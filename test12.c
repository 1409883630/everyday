//ʵ�ֺ����ж�year�ǲ�������
#include<stdio.h>
void leap(int x) //leap���ж�����ĺ���
{
	if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0)
	{
		printf("%d������\n", x);
	}
	else
	{
		printf("%d��������\n", x);
	}
}
int main()
{
	int a;
	scanf("%d", &a);
	leap(a); //���ú���
	return 0;
}