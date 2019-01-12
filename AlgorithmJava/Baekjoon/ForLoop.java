/**
*
* 2019.01.11 Bakejoon for JAVA
*
*/
/* 2741 */
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for(int i = 1; i <= N; i++) {
        	System.out.println(i);
        }
        scanner.close();
    }
}
/* 2438 */
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i; j++) {
            	System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* 2439 */
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
            for(int j = 1; j <= N - i - 1; j++) { // **j = 0이면 앞에 공백생김**
            	System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++) {
            	System.out.print("*");
            }
            System.out.println();
        }
 //       scanner.close();
    }
}
/* 2440 */
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
            for(int k = 1; k < N - i + 1; k++) {
            	System.out.print("*");
            }
            System.out.println();
        }
 //       scanner.close();
    }
}
/* 2441 */
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j <= i - 1; j++) { // **j = 0이면 앞에 공백생김**
            	System.out.print(" ");
            }
        	for(int k = 1; k < N - i + 1; k++) {
            	System.out.print("*");
            }
            System.out.println();
        }
 //       scanner.close();
    }
}
/*8393*/
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int N = scanner.nextInt();
		        int sum = 0;
		        for(int i = 1; i <= N; i++) {

		        	sum += i;		        
		        }
                System.out.println(sum);

		 //       scanner.close();
		    }
	}
