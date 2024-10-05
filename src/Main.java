
import classes.Customer;
import classes.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Peppe", "Rotondo", "PPRPP", 21000);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);



        Customer foundCustomer =  bank.searchCustomerbyFiscalCode("PPRPP");
        if(foundCustomer == null){
            System.out.println("Retry?");
        }else{
            System.out.println(foundCustomer.getInfo());
        }


    }


}