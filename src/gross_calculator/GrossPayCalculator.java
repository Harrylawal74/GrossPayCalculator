//Because class is within a package. First line of code must declare that package
package gross_calculator;

//Class declaration
public class GrossPayCalculator {

    public static void main(String[] args) {
        //variable declaration
        int hours = 40;
        //double is a decimal data type
        double payRate = 25.5;
        double grossPay = hours * payRate;
        System.out.println("Gross pay: £"+grossPay);

    }
}
