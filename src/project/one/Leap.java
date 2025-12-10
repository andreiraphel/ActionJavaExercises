package project.one;

public final class CheckYear {
    private CheckYear() {
        super();
    }
    /**
     *
     * @param args
     */
    /**
     * @param args
     */
    public static void main(final String[] args) {
        final int year = 2001;
        Leap newYear = new Leap(year);
        if (newYear.isLeapYear()) {
            System.out.println(newYear.getYear() + " is a leap year");
        } else {
            System.out.println(newYear.getYear() + " is not a leap year");
        }
    }
}