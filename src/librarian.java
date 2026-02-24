public class librarian extends Person {

    private String employeeID;

    public librarian(String name, String employeeID) {
        super(name, 0);
        this.employeeID = employeeID;
    }

    public void displayInfo() {
        System.out.println("Librarian Name : " + getName());
        System.out.println("Employee ID    : " + employeeID);
    }
}