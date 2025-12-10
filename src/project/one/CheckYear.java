package project.one;

public class Leap {
    /**
     * year in YYYY.
     */
    private int year;
    /**
     *
     * @return class year
     */
    public int getYear() {
        return this.year;
    }
    Leap(final int newYear) {
        this.year = newYear;
    }
    final boolean isLeapYear() {
        final int num1 = 400;
        final int num2 = 100;
        final int num3 = 4;
        return (this.year % num3 == 0)
                && (this.year % num2 != 0 || this.year % num1 == 0);
    }
}


