/**
 * @class: SumOfDigits
 * @aurthor: Marvin Fuentes
 * @course: ITEC2140 section4
 * @written: February 28, 2023
 * This program will determine the sum of the digits of the
 * provided integer by the user. It will print out the number
 * the user entered and then list the number of digits that
 * makes as a sum.
 */
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        int temp = num;
        while(temp > 0) {
            int lastDigit = temp % 10;
            sum =  sum + lastDigit;
            temp = temp / 10;
        }
        System.out.println("The sum of digits of " + num + " is " +sum + ".");
    }
}
