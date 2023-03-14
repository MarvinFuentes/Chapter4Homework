/**
 * @class: ReverseStrings
 * @aurthor: Marvin Fuentes
 * @course: ITEC2140 section4
 * @written: March 14, 2023
 * This program will prompt the user to enter a String value,
 * and it will reverse the String. Then, the program will
 * determine if the original string is the same or equal to
 * the reverse string. If the strings are equal it will print
 * out that they are equal but if it is not it will print out that
 *  it is not equal.
 */
import java.util.Scanner;
public class ReverseStrings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = input.nextLine();
        String reverse = "";
        for(int i = str.length() - 1;i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        if (str.length() == reverse.length()){
            System.out.println("String value\""+str+"\" and its reverse \""+reverse+"\" are equal.");
        }
        else{
            System.out.println("String value\\\"\"+str+\"\\\" and its reverse \\\"\"+reverse+\"\\\" are not equal.");
        }
    }
}
