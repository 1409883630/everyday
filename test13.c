//ʵ��һ���������ж�һ�����ǲ�����������������ʵ�ֵĺ�����ӡ100��200֮���������
#include<stdio.h>
void  prime(int x)//�����ж������ĺ���
{
	int i = 2;
	for (i = 2; i < x; i++)
	{
		if (x%i == 0) //����ģ���ж�����
		{
			break;
		}
	}
	if (i < x)
	{
		1;
	}
	else 
	{
		printf("%d ", x);
	}
}
int main()//������������������
	{
	int a = 100;
	for (a = 100; a <= 200; a++)
	{
		prime(a);
	}
	printf("\n");
	return 0;
	}