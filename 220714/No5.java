package july14;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num3 = scanner.nextInt();

        StringTokenizer st = new StringTokenizer(str);
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        if (num1 < 23){
            if(num2 + num3 < 60){
                int newHour = num1;
                int newMins = num2 + num3;
                System.out.println(newHour + " " + newMins);
            } else{
                int newHour = num1 + 1;
                int newMins = num2 + num3 - 60;
                System.out.println(newHour + " " + newMins);
            }
        } else {
            if(num2 + num3 < 60){
                int newHour = num1;
                int newMins = num2 + num3;
                System.out.println(newHour + " " + newMins);
            } else{
                int newHour = 0;
                int newMins = num2 + num3 - 60;
                System.out.println(newHour + " " + newMins);
            }
        }
        
    }
}
