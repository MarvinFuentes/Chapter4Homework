/**
 * @class: PrimeNumbers
 * @aurthor: Marvin Fuentes
 * @course: ITEC2140 section4
 * @written: February 28, 2023
 * This program will determine if the integer provided by the user is a prime or
 * composite number. After the user enters the integer the program will determine
 * is the integer is a prime or composite number.
 */
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int num = input.nextInt();
        int count = 0;
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            count++;
        }
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is a composite number.");
                    count++;
                    break;
                }
            }
        }
        if(count == 0)
        {
            System.out.println(num + " is a prime number.");
        }
        }
    }

