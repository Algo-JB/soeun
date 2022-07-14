package July14;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (89 < score & 101 > score){
            System.out.println("A");
        } else if (79 < score & 90 > score){
            System.out.println("B");
        } else if (69 < score & 80 > score){
            System.out.println("C");
        } else if (59 < score & 70 > score){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
