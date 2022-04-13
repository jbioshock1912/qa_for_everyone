package qa_for_everyone.hw7_2_oop;

class MonthUtils {
    private static Month[] monthArray = {
            new Month("January", 31, 0),
            new Month("February"),
            new Month("March", 31, 0),
            new Month("April", 30, 0),
            new Month("May", 31, 0),
            new Month("June", 30, 0),
            new Month("July", 31, 0),
            new Month("August", 31, 0),
            new Month("September", 30, 0),
            new Month("October", 31, 0),
            new Month("November", 30, 0),
            new Month("December", 31, 0)
    };

    // почему не могу здесь запонить массив??
    static void setFebruary(Month[] monthArray, int year) {
        if (year % 4 == 0) {
            monthArray[2].setNumberOfAllDays(29);
        } else {
            monthArray[2].setNumberOfAllDays(28);
        }
    }

    static int countWorkDays(Month[] monthArray, int year) {
        return 0;
    }
}
