/**
 * @class: NCalculator
 * @aurthor: Marvin Fuentes
 * @course: ITEC2140 section4
 * @written: March 14, 2023
 * This program will prompt the user to enter an integer value.
 * The program will then calculate and print the factorial of
 * the integer the user entered.
 */
import java.util.Scanner;
public class NCalculation {
    public static void main(String [] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value:");
        int value = input.nextInt();
        int sum = 1;

        for(int i = value; i > 0; i--){
            sum = sum * i;
        }
        System.out.println("Factorial of the integer provided is:" + sum);
    }
}
