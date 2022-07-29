package july27;

import java.util.Scanner;

public class BOJ17478 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int count = 0;
      int count2 = 0;
      int N = sc.nextInt();

      for (int i = 1; i < N + 1; i++) {
         if (i < 100) {
        	 count = i;
         } 
         else {
            int thrid = i % 10;
            int second = (i / 10) % 10;
            int first = i / 100;
            int d = second - first;
            int d2 = thrid - second;
            
//            System.out.println(thrid + ", " + second + ", " + first);
            
//            System.out.println("d: " + d + " d2: "+d2);
            if (d2 == d) {
               count2++;
               System.out.println("N = " + i);
               System.out.println(d + ", " + d2);
            	}
         }
         System.out.println(count2);
      }
      System.out.println(count + count2);
   }
}
