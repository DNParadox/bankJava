package classes;//I clienti sono caratterizzati da
//nome,
//cognome,
//codice fiscale
//stipendio


public class Customer  extends User{
    protected int salary;

    public Customer() {
        this("Mario", "Rossi", "defaultFiscalCode", 18000);
    }

    public Customer(String name, String lastName, String fiscalCode, int salary){
        super(name,lastName, fiscalCode);
        this.salary = salary;
    }

//
//    @Override
//    public String getUserInfo() {
//        return "";
//    }

    public String getCustomerInfo() {
        return "Name: " + name + "\n" +
                "Last Name: " + lastName + "\n" +
                "Fiscal Code: " + fiscalCode + "\n" +
                "Salary: " + salary;
    }
}
