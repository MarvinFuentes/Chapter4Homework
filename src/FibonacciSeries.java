/**
 * @class: FibonacciSeries
 * @aurthor: Marvin Fuentes
 * @course: ITEC2140 section4
 * @written: March 14, 2023
 * This program will print out the first 30 values of the
 * Fibonacci series.
 */
public class FibonacciSeries {
    public static void main(String[] args){
        int number = 30;
        int num1 = 0;
        int num2 = 1;
        for(int i = 1; i <= number; i++){
            System.out.print( num1+ " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        }
    }


