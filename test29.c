//���0��100000֮������С�ˮ�ɻ����������
#include<stdio.h>
#include<math.h>
int main()
{
	int n = 0;
	scanf("%d", &n);
	for (int i = 0; i <= n; i++)
	{
		int a = 1;
		int c = i;

		while (c>9)//�ж�λ��
		{
			c /= 10;
			a++;
		}
		int m = i;
		int b = 0;
		while (m)//�ж��ǲ���ˮ�ɻ���
		{
			b += pow(double(m % 10), a);
			m /= 10;
		}
		if (i == b)//��ӡˮ�ɻ���
		{
			printf("%d ", i);
		}
	}
	printf("\n");
	return 0;
}