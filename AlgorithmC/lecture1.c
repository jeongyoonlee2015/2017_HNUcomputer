//Al초급 1강
/*practice1 : 직사각형 넓이 구하기
가로와 세로의 길이를 입력받아 직사각형의 넓이를 출력하는 순서도를 작성하시오. X, Y, A */
#include <stdio.h>
int main(){
	int x, y, A;
	printf("가로를 입력하세요.");
	scanf("%d", &x);
	printf("세로를 입력하세요.");
	scanf("%d", &y);
	A = x * y;
	printf("직사각형의 넓이는 %d입니다.\n", A);
	
	return 0;
}
/*practice2 : 두 수의 합 구하기
두 개의 양의 정수를 입력받아 합을 순서도를 작성하시오. X, Y, S */
#include <stdio.h>
int main(){
	int x, y, S;
	printf("두 양의 정수를입력하세요.");
	scanf("%d %d", &x, &y);
	S = x + y;
	printf("두 수의 합은 %d입니다.\n", S);
	
	return 0;
}
