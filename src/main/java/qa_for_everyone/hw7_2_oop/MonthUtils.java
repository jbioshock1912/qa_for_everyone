package qa_for_everyone.hw7_2_oop;

class MonthUtils {

    public static final Month JANUARY = new Month("January", 31, 18);
    public static final Month FEBRUARY = new Month("February", 28, 20);
    public static final Month MARCH = new Month("March", 31, 21);
    public static final Month APRIL = new Month("April", 30, 20);
    public static final Month MAY = new Month("May", 31, 21);
    public static final Month JUNE = new Month("June", 30, 20);
    public static final Month JULY = new Month("July", 31, 21);
    public static final Month AUGUST = new Month("August", 31, 21);
    public static final Month SEPTEMBER = new Month("September", 30, 20);
    public static final Month OCTOBER = new Month("October", 31, 21);
    public static final Month NOVEMBER = new Month("November", 30, 20);
    public static final Month DECEMBER = new Month("December", 31, 21);

    static int countWorkDays(Month[] monthArray) {
        int numberOfWorkDay = 0;
        for (Month value : monthArray) {
            numberOfWorkDay = numberOfWorkDay + value.getNumberOfWorkDays();
        }
        return numberOfWorkDay;
    }
}
