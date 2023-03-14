/**
 * @class: CharacterIndex
 * @aurthor: Marvin Fuentes
 * @course: ITEC2140 section4
 * @written: March 14, 2023
 * This program will prompt the user to enter a String value
 * and will then prompt them to enter a character. The program
 * will display the corresponding last index of the character
 * entered by the user. If the user enters a character that isn't
 * in the String it will display index to be -1.
 */
import java.util.Scanner;
public class CharacterIndex {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = input.nextLine();
        System.out.print("Enter the character of desired index:");
        char character = input.next().charAt(0);
        int index = str.lastIndexOf(character);
        if (index == -1){
           System.out.println("Last occurrence of character \""+character+"\" in \""+str+"\" is at index -1.");
        }
        else{
            System.out.println("Last occurrence of character \""+character+"\" in \""+str+"\" is at index " + index + ".");
        }
    }
}
