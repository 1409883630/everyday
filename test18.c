//12*12�˷���
#include<stdio.h>
void add(int n)//����һ������
{
	for (int i = 1; i < n + 1; i++)//˫��forѭ����ӡ
	{
		for (int j = 1; j <= i; j++)
		{
			printf("%d * %d = %2d ", j, i, i*j);
		}
		printf("\n");
	}
}
int main()
{
	int a;
	scanf("%d", &a);
	add(a);//����
	return 0;
}