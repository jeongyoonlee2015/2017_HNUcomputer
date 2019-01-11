/**
*
* 2019.01.11 Baekjoon for JAVA
*/
/*문자 받아 출력하기 11718*/
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			String cmd = scanner.nextLine();
			System.out.println(cmd);	
		}
		scanner.close();		
	}
}

// 사칙연산
/*10998*/
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		System.out.println(A*B);
		scanner.close();		
	}
}
/*1008*/
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextInt();
		double B = scanner.nextInt();
		System.out.println(A/B);
		scanner.close();		
	}
}
/*사칙연산 출력 10869*/
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
		
		scanner.close();		
	}
}
/*10430*/
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		System.out.println((A + B) % C);
		System.out.println((A % C + B % C) % C);
		System.out.println((A * B) % C);
		System.out.println((A % C * B % C) % C);		
		scanner.close();		
	}
}
/*2558*/
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		System.out.println(A + B);
		scanner.close();		
	}
}

/* ***Hard*** 2839 설탕배달 */
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int ans = 0;
        
        while(true){
            if(N%5==0){
                ans += (N/5);
                break;
            }
            N -= 3;
            ++ans;
            if(N < 0) break;
        }
        System.out.println(N < 0 ? -1 : ans);
        scanner.close();
    }
}
