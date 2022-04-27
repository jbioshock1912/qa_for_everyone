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

    static int countWorkDays(Month[] monthArray) { // как так получается что мы передаем в мтеод наш массив с месяцами???
        int numberOfWorkDay = 0;
        for (Month value : monthArray) {
            numberOfWorkDay = numberOfWorkDay + value.getNumberOfWorkDays();
        }
        return numberOfWorkDay;
    }

    static Month[] getQuarter(Month[] monthArray, int numberQuarter) {
        Month[] monthQuarter = new Month[3];
        switch (numberQuarter) {
            case (1):
                monthQuarter = new Month[]{JANUARY, FEBRUARY, MARCH};
                break;

            case (2):
                monthQuarter = new Month[]{APRIL, MAY, JUNE};
                break;

            case (3):
                monthQuarter = new Month[]{JULY, AUGUST, SEPTEMBER};
                break;

            case (4):
                monthQuarter = new Month[]{OCTOBER, NOVEMBER, DECEMBER};
                break;
        }
        return monthQuarter;
    }

    static Month[] getHalfYear(Month[] monthArray, int numberHalfYear) {
        Month[] monthHalfYear = new Month[6];
        switch (numberHalfYear) {
            case (1):
                monthHalfYear = new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};
                break;

            case (2):
                monthHalfYear = new Month[]{JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
                break;
        }
        return monthHalfYear;
    }
}
