public abstract class Person {

    private String name;
    private int personID;

    public Person(String name, int personID) {
        this.name = name;
        this.personID = personID;
    }

    public String getName() { return name; }
    public int getPersonID() { return personID; }

    public abstract void displayInfo();
}