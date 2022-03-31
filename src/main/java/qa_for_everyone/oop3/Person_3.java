package qa_for_everyone.oop3;

public class Person_3 {
    private String name;
    private int age;
    private boolean sex;

    public String getName() {
        if (sex){
            return "Mr. " + name;
        }
        else {
            return "Mrs. " + name;
        }
    }

}
