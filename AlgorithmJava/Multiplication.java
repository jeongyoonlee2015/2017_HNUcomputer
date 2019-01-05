import java.util.Scanner;

public class Multiplication {

    /**
     public static void main(String[] args){
     for(int i = 2; i < 10; i++){
     System.out.println("< "+ i + " 단 >");
     for (int j = 1; j < 10; j++) {
     System.out.println(i + " * " + j + " = " +  i * j);
     }
     }
     }
     }*/
    public static void main(String[] args){
        while(true){
            System.out.println("\n구구단 연산을 할 단을 입력하세요.(종료: 0)");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if(i == 0){
                break;
            }else if(i > 9 || i < 2){
                System.out.println("1에서 9사이를 입력해주새요.");
            }else{
                System.out.println("< "+ i + " 단 >");
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + " * " + j + " = " +  i * j);
                }
            }
        }
    }
}
