package QuotaValidator;

import java.util.Scanner;

public class QuotaChecker {
    public static void main(String[] args) {

        //initiate quota value
        int quota = 15;

        //outputs question to user, prompting them to answer.
        System.out.println("How many sales did you make this month? ");

        //opens scanner function
        Scanner scanner = new Scanner(System.in);

        //user input is assigned to "sales" variable
        int sales = scanner.nextInt();

        //checks whether user met the quota and or gets a bonus
        if (sales > quota){
            System.out.println("You made more than "+quota+" sales this month, you get a bonus of £1000! ");
        }else if (sales == quota) {
            System.out.println("You don't get a bonus this month but you met your quota of "+quota+". Well done :)");
        }else {
            System.out.println("You did not meet your quota this month, "+(quota-sales)+" sales short ! That's okay, try harder next month");
        }



    }
}
