package src;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SimpleStarPrint {
    public static void main(String[] args) {

        System.out.print("Please enter the number : ");
        Scanner sc = new Scanner(System.in);
        int starRow = sc.nextInt();

        for (int i = 1; i <= starRow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
