package classes;

public abstract class User {
    protected String name;
    protected String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }


    public abstract String getInfo();

}
