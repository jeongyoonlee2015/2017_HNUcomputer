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
