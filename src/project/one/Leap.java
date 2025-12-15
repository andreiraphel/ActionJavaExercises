package project.one;

public final class Leap {
    private Leap() {
        super();
    }
    /**
     * @param args
     */
    public static void main(final String[] args) {
        final int year = 2017;
        CheckYear newYear = new CheckYear(year);
        if (newYear.isLeapYear()) {
            System.out.println(newYear.getYear() + " is a leap year");
        } else {
            System.out.println(newYear.getYear() + " is not a leap year");
        }
    }
}