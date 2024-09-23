package QuotaValidator;

import java.util.Scanner;

public class QuotaChecker {
    public static void main(String[] args) {
        //outputs question to user, prompting them to answer.
        System.out.println("How many sales did you make this month? ");

        //opens scanner function
        Scanner scanner = new Scanner(System.in);

        //user input is assigned to "sales" variable
        int sales = scanner.nextInt();

        //checks whether user met the quota and or gets a bonus
        if (sales > 10){
            System.out.println("You made more than 10 sales this month, you get a bonus of £1000! ");
        }else if (sales == 10) {
            System.out.println("You don't get a bonus this month but you met your quota. Well done :)");
        }else {
            System.out.println("You did not meet your quota this month! That's okay, try harder next month");
        }

    }
}
