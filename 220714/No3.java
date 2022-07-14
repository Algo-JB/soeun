package July14;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > 0){
            if (num2 > 0){
                System.out.println("1");
            }else {
                System.out.println("4");
            }
        }else{
            if (num2 > 0){
                System.out.println("2");
            }else {
                System.out.println("3");
            }
        }
        
    }
}
