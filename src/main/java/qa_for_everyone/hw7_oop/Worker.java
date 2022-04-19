package qa_for_everyone.hw7_oop;

class Worker extends Employee {

    Worker(String name, double salary) {
        super(name, salary);
    }


    @Override
    double getSalary() {
        return getBaseSalary();
    }
}

