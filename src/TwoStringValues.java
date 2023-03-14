/**
 * @class: TwoStringValues
 * @aurthor: Marvin Fuentes
 * @course: ITEC2140 section4
 * @written: March 14, 2023
 * This program will prompt the user to enter two separate strings. Then it will
 * determine which string is longer than the other one. The program will also
 * determine which string appears before the other one. Finally, the program
 * will create a sentence from the two separate strings the user entered at the beginning
 * of the program.
 */
import java.util.Scanner;
public class TwoStringValues {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first string:");
        String string1 = input.nextLine();
        System.out.print("Enter your second string:");
        String string2 = input.nextLine();
        if(string1.length() > string2.length()){
            System.out.println("String \""+string1+"\" is longer than \""+string2+"\".");
        }
        else if(string2.length() > string1.length()){
            System.out.println("String \""+string2+"\" is longer than \""+string1+"\".");
        }
        else{
            System.out.println("Both strings are the same length.");
        }
        if(string1.length() < string2.length()){
            System.out.println("String\""+string1+"\" appears before String \""+string2+"\" in lexicographic order.");
        }
        else if(string1.length() > string2.length()){
            System.out.println("String\""+string2+"\" appears before String \""+string1+"\" in lexicographic order.");
        }
        else{
            System.out.println("Both Strings are the same in lexicographic order");
        }
        String sentence = string1 + " " + string2;
        System.out.println("New sentence created is \""+sentence+"\".");
    }
}
