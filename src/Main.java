/**
 * multiplication table
 * 1 2 3 4 5 6 7 8 9
 * 2 4 6 8 10 12 14 16 18
 * 3 6 9 12 15 18 21 24 27
 */
public class Main {
    public static void main(String[] args) {

     //   for(int rows =1; rows <= 9; rows++){

     //       for(int column = 1; column <= 9; column++){

     //           System.out.printf("%4d", (rows * column));

     //       }
     //       System.out.println();
     //   }



        String space = " ";
        for (int i = 0; i <= 7; i++){
            //inner for loop space
            for(int j = 1; j<= 7 - i; j++){
                System.out.printf("%4s", space);
            }

            //inner for loop for number
            for(int j = 0; j<= i; j++){
                int number = (int)(Math.pow(2,j));
                System.out.printf("%4d", number);
            }

            System.out.println();

        }











    }
}