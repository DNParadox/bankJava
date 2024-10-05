package classes;//I clienti sono caratterizzati da
//nome,
//cognome,
//codice fiscale
//stipendio


public class Customer  extends User{
    protected int salary;
    public String fiscalCode;

    public Customer() {
        this("Mario", "Rossi", "defaultFiscalCode", 18000);
    }

    public Customer(String name, String lastName, String fiscalCode, int salary){
        super(name,lastName);
        this.fiscalCode = fiscalCode;
        this.salary = salary;
    }


    @Override
    public String getInfo() {
        return "Name: " + name + "\n" +
                "Last Name: " + lastName + "\n" +
                "Fiscal Code: " + fiscalCode + "\n" +
                "Salary: " + salary;
    }

}
