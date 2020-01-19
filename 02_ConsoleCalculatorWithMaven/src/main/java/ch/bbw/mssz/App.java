package ch.bbw.mssz;

/**
 * @author Matthias_Stierlin
 * @version 19.01.2020
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        valueA = 10;
        valueB = 20;

        System.out.println("Sum " + valueA + " + " + valueB + " = " + calculator.sum(valueA,valueB));

        valueA = 30;
        valueB = 10;

        System.out.println("Subtract " + valueA + " - " + valueB + " = " + calculator.subtract(valueA,valueB));
    }
}
