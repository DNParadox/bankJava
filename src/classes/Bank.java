package classes;

import java.util.ArrayList;
import java.util.List;


public class Bank {
    public String name;
    public List<Customer> customers;

    // Costruttore
    public Bank(){
        this.name = "Banca Popolare";
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void removeCustomer(Customer customer){
        this.customers.remove(customer);
    }

    public Customer searchCustomerbyFiscalCode(String fiscalCode) {
        for (Customer customer : customers) {
            if (customer.fiscalCode.equals(fiscalCode)) {
                System.out.println("Class.Client founded");
                return customer;
            }
        }
        System.out.println("Class.Client not found");
        return null;
    }

}
