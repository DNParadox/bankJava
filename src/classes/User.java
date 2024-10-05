package classes;

public abstract class User {
    protected String name;
    protected String lastName;
    protected String fiscalCode;

    public User(String name, String lastName, String fiscalCode) {
        this.name = name;
        this.lastName = lastName;
        this.fiscalCode = fiscalCode;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public abstract String getUserInfo();

}
