package qa_for_everyone.oop3;

public class Person_3 {
    private String name;
    private int age;
    private Sex sex;

    public String getName() {
        return sex == Sex.FEMALE ? "Mrs. " : "Mr. " + this.name;
    }
}
