package qa_for_everyone.hw7_2_oop;

public class Starting {

    public static void main(String[] args) {
        Month[] monthTest1 = MonthUtils.getYear();
        Month[] monthTest2 = MonthUtils.getYear();
       monthTest1[0] = null;
        System.out.println(monthTest1[0]);
        System.out.println(monthTest2[0]);
        System.out.println(MonthUtils.getYear());
        System.out.println(monthTest1);
        System.out.println(monthTest2);
        System.out.println(MonthUtils.JANUARY);
    }
}
