//Al초급 2강
/*practice1 : 두 수의 차 구하기
두 개의 양의 정수를 입력받아 차를 순서도를 작성하시오. X, Y, S */
#include <stdio.h>
int main(){
	int x, y, D;
	printf("두 양의 정수를입력하세요.");
	scanf("%d %d", &x, &y);
	
	if(x >= y){
		D = x + y;
	}else{
		D = x - y;
	}
	printf("%d", D);
	
	return 0;
}
/*practice2 : 2의 배수 합계 구하기 (1 to 6) i, sum */
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
	printf("합계는 %d입니다.\n", sum);
	return 0;
}
