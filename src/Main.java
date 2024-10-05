
import classes.Customer;
import classes.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Peppe", "Rotondo", "PPRPP", 21000);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);


        for (Customer customer : bank.customers) {
            System.out.println(" Client of the bank: " + customer.getName() + " " + customer.getLastName());
        }

        bank.removeCustomer(customer1);

        for (Customer customer : bank.customers) {
            System.out.println(" Client of the bank: " + customer.getName() + " " + customer.getLastName());
        }


        Customer foundCustomer =  bank.searchCustomerbyFiscalCode("PPRPP");
        System.out.println(foundCustomer.getName());


    }


}