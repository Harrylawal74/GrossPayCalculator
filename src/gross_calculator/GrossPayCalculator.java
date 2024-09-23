//Because class is within a package. First line of code must declare that package
package gross_calculator;

//import scanner to be used later in the algorithm
import java.util.Scanner;

//Class declaration
public class GrossPayCalculator {

    public static void main(String[] args) {
        //variable declaration
        int hours = 0;
        //outputs question to user, prompting them to answer.
        System.out.println("How many hours did you work? ");

        //takes input from user and applies value to "hours" variable.
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //double is a decimal data type
        double payRate = 25.5;

        //Multiplies payRate and hours
        double grossPay = hours * payRate;

        //Outputs the value of grossPay
        System.out.println("Gross pay: £"+grossPay);

    }
}
