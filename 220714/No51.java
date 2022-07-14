package July14;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num3 = scanner.nextInt();

        StringTokenizer st = new StringTokenizer(str);
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        if (num2 + num3 > 59){
            int plusHour = (num2 + num3) / 60;
            int newHour = num1 + plusHour;
            int newMins = (num2 + num3) - 60 * plusHour;

            if(newHour < 23){
                System.out.println(newHour + " " + newMins);
            }else {
                int newHour2 = newHour - 24;
                System.out.println(newHour2 + " " + newMins);
            }
            
        } else {
            int newMins = num2 + num3 ;
            System.out.println(num1 + " " + newMins);
        }
        
    }
}
