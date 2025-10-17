// Q4. create a base class teacher with a showdetails() method declared as protected. create a subclass math teacher that overrides it as public demonstrate the concept that overriding can't reduce visibility
class Teacher {
    protected void showDetails() {
        System.out.println("Teacher details");
    }
}
class MathTeacher extends Teacher {
    @Override
    public void showDetails() {
        System.out.println("Math Teacher details");
    }
}
class TestTeacher {
    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher();
        mt.showDetails();
    }
}