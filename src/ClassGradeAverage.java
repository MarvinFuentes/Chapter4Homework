/**
 * @class: ClassGradeAverage
 * @aurthor: Marvin Fuentes
 * @course: ITEC2140 section4
 * @written: February 28, 2023
 * This program will permit the user to enter as many grades
 * until the user enters an input that is not an integer.
 * The program will then create an average of all the grades
 * and it will exclude all other inputs that weren't valid.
 */
import java.util.Scanner;
public class ClassGradeAverage {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);
        double sum = 0; int validcount = 0;
        System.out.println("Enter grade: ");
        while(grades.hasNextDouble()){
            System.out.println("Enter grade: ");
            if(grades.hasNextDouble()){
                double value = grades.nextDouble();
                sum += value;
                validcount++;
            }
            else{
                String input = grades.next();
                System.out.println("You entered" + input + ", which is not a valid number.");
            }
        }
        double average = 0;
        if (validcount > 0){
            average = sum / validcount;
            System.out.println("Average class grade: " + average);
        }
        else{
            System.out.println("Not a valid inputs.");
        }
    }
}
