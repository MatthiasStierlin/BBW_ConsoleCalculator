package ch.bbw.mssz;

import java.text.DecimalFormat;

/**
 * @author Matthias_Stierlin
 * @version 20.01.2020
 */
public class Calculator {

    DecimalFormat toTwo = new DecimalFormat("0.00");

    DecimalFormat toOne = new DecimalFormat("0.0");

    public int sum(int addnum1, int addnum2) {
        return addnum1 + addnum2;
    }

    public int subtract(int subnum1, int subnum2) {
        return subnum1 - subnum2;
    }

    public int division(int dividend1, int dividend2) {
        return dividend1 / dividend2;
    };

    protected int multiplikation(int multiplier1, int multiplier2) {
        return multiplier1 * multiplier2;
    }

    /** DecimalFormat only returns a string.
     */
    String interest(double startCapital, double interestPercentage, double years) {
        return toTwo.format(startCapital * Math.pow((1 + interestPercentage/100),years));
    }

    private String calculatestartCapitale(double capitalWithInterest, double interestPercentage, double years) {
        return toOne.format(capitalWithInterest / Math.pow((1 + interestPercentage / 100),years));
    }
}
