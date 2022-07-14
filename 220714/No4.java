package July14;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(str);
        int hour = Integer.parseInt(st.nextToken());
        int mins = Integer.parseInt(st.nextToken());

        if (hour > 0){
            if (mins > 45 | mins == 45){
                int newHour = hour;
                int newMins = mins - 45;
                System.out.println(newHour + " " + newMins);
            } else {
                int newHour = hour - 1;
                int newMins = mins + 15;
                System.out.println(newHour + " " + newMins);
            }
        } else {
            if (mins > 45){
                int newHour = 0;
                int newMins = mins - 45;
                System.out.println(newHour + " " + newMins);
            }else if(mins != 45) {
                int newHour = 23;
                int newMins = mins + 15;
                System.out.println(newHour + " " + newMins);
            }else {
                int newHour = 0;
                int newMins = 0;
                System.out.println(newHour + " " + newMins);
            }
        }

        
    }
}
