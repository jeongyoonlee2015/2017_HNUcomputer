//Al�ʱ� 2��
/*practice1 : �� ���� �� ���ϱ�
�� ���� ���� ������ �Է¹޾� ���� �������� �ۼ��Ͻÿ�. X, Y, S */
#include <stdio.h>
int main(){
	int x, y, D;
	printf("�� ���� �������Է��ϼ���.");
	scanf("%d %d", &x, &y);
	
	if(x >= y){
		D = x + y;
	}else{
		D = x - y;
	}
	printf("%d", D);
	
	return 0;
}
/*practice2 : 2�� ��� �հ� ���ϱ� (1 to 6) i, sum */
#include <stdio.h>
int main(){
	int i;
	int sum = 0;
	
	for(i = 0; i < 7; i++)
		if(i % 2 == 0){
			sum = sum + i;
			i++;
		}else{
			i++;
		}
	printf("�հ�� %d�Դϴ�.\n", sum);
	return 0;
}
