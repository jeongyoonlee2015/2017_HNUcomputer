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
