/*9498번*/
package java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        if(result >= 90){
            System.out.println("A");
        }else if(result >= 80 && result <=89){
            System.out.println("B");
        }else if(result >= 70 && result <=79){
            System.out.println("C");
        }else if(result >= 60 && result <=69){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
/*10817: 코드를 더 간결하게 할 수 있는 방법은?*/
package Main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        if(num1 >= 1 && num2 >=1 && num3>=1 && num1 <= 100 && num2 <= 100 && num3 <= 100){
            if(num1 >= num2 && num1 >= num3){
                if(num2 > num3){
                    System.out.println(num2);
                }
                else{
                    System.out.println(num3);
                }
            }else if(num2 >= num3 && num2 >= num1){
                if(num3 > num1){
                    System.out.println(num3);
                }
                else{
                    System.out.println(num1);
                }
            }else{
                if(num2 > num1){
                    System.out.println(num2);
                }
                else{
                    System.out.println(num1);
                }
            }
        }
    }
}

/*10871 println, print 잘보기*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] a = new int[N];
        for(int i = 0; i < a.length; ++i){
            a[i] = sc.nextInt();
        }
        sc.close();

        for(int i= 0; i < a.length; ++i){
            if(a[i] < X){
                System.out.print(a[i] + " ");
            }
        }

    }
}

/*1546 Arrays.sort의 사용: import java.util.Arrays;*/
package Main;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        float[] score = new float[num];
        float sum = 0;
        for(int i = 0; i <num; i++){
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);
        for(int i = 0; i < num; i++){
            score[i] = (score[i] / score[num - 1]);
            sum += score[i];
        }
        float avr = (sum / num) * 100.0f;
        System.out.println(avr);


    }
}


