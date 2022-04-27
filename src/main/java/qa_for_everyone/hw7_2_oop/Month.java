package qa_for_everyone.hw7_2_oop;

public final class Month {
    private final String month;
    private int numberOfAllDays;
    private int numberOfWorkDays;

    public Month(String month, int numberOfAllDays) {
        this.month = month;
        this.numberOfAllDays = numberOfAllDays;
    }

    Month(String month, int numberOfAllDays, int numberOfWorkDays) {
        this.month = month;
        this.numberOfAllDays = numberOfAllDays;
        this.numberOfWorkDays = numberOfWorkDays;
    }

    Month(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public int getNumberOfAllDays() {
        return numberOfAllDays;
    }

    public int getNumberOfWorkDays() {
        return numberOfWorkDays;
    }
}
