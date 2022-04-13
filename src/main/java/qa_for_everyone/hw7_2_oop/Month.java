package qa_for_everyone.hw7_2_oop;

public class Month {
    private String month;
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

    public void setMonth(String month) {
        this.month = month;
    }

    public int getNumberOfAllDays() {
        return numberOfAllDays;
    }

    public void setNumberOfAllDays(int numberOfAllDays) {
        this.numberOfAllDays = numberOfAllDays;
    }

    public int getNumberOfWorkDays() {
        return numberOfWorkDays;
    }

    public void setNumberOfWorkDays(int numberOfWorkDays) {
        this.numberOfWorkDays = numberOfWorkDays;
    }
}
