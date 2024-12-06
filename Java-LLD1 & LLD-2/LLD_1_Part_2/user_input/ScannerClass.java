package LLD_1_Part_2.user_input;

import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        // import scanner class
        Scanner sc=new Scanner(System.in);
         // read String
        String name=sc.next();

        // read int
        int age=sc.nextInt();
        boolean adult=sc.nextBoolean();
    }
}
