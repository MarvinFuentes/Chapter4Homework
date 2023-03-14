/**
 * @class: HighAndLowGrade
 * @aurthor: Marvin Fuentes
 * @course: ITEC2140 section4
 * @written: March 14, 2023
 * This program will prompt the user to enter multiple grades until
 * the user decides to end entering grades by entering a character.
 * After the user has entered all the grades it decides which grade
 * is the highest and which one is the lowest.
 */
import java.util.Scanner;
public class HighAndLowGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lowest = 0;
        int highest = 0;
        int count = 0;
        System.out.print("Enter student grades:");
        while(input.hasNextDouble()){
            System.out.print("Enter student grades & when done enter any character:");
            int grades = input.nextInt();
            if(count == 0){
                lowest = grades;
                highest = grades;
                count++;
            }
            if(lowest > grades){
                lowest = grades;
            }
            if(highest < grades){
                highest = grades;
            }
        }
        System.out.println("The highest student grade:" + highest);
        System.out.println("The lowest student grade:" + lowest);
    }
}
