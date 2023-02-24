package AverageOfGrades;

// To be able to use the scanner class we imported it.
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        // Created a scanner object so that we can take input from users.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Mathematics grade : ");
        // To be able to take integer inputs from users we should use next.Integer.
        int mG = input.nextInt();
        /* Since we used system.out.print it will print everything side by side to
         avoid that we used system.out.println it will pass to other line with that.*/
        System.out.println();
        System.out.print("Please enter tour Physics grade : ");
        int pG = input.nextInt();
        System.out.println();
        System.out.print("Please enter your Chemistry grade : ");
        int cG = input.nextInt();
        System.out.println();
        System.out.print("Please enter your Turkish grade : ");
        int tG = input.nextInt();
        System.out.println();
        System.out.print("Please enter your History grade : ");
        int hG = input.nextInt();
        System.out.println();
        System.out.print("Please enter your Music grade : ");
        int muG = input.nextInt();
        System.out.println();
        input.close();
        double averageEst = (mG + pG + cG + tG + hG + muG) / 6.0;
        // The reason why we wrote 6.0 is that if we have just written 6 it
        // average wasn't going to be the accurate result it was just going to
        // show ---.0 kind of double.
        String lastResult = averageEst>60 ? " Congratulations, you've past!" :
                " Unfortunately, you've failed! Please try again next time.";
        /* with the last result we asked if the average is higher than 60,
        * if it's higher it will return true if not false but instead of true or false
        * we made it return sentence such as congrats etc. */
        System.out.println(" Your Average : " + averageEst);
        System.out.println(lastResult);





    }
}
