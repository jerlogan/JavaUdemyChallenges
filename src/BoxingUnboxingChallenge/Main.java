package BoxingUnboxingChallenge;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


//        Customers

        Customer customer1 = new Customer("Jeff Bridges");
        customer1.getTransactions().add(3.50);
        customer1.getTransactions().add(7.45);
        customer1.getTransactions().add(10.43);

        Customer customer2 = new Customer("Natalie Portman");
        customer2.getTransactions().add(5.45);
        customer2.getTransactions().add(7.43);

        Customer customer3 = new Customer("Paul Rudd");
        customer3.getTransactions().add(5.45);
        customer3.getTransactions().add(7.43);
        customer3.getTransactions().add(16.11);
        customer3.getTransactions().add(16.11);

//        Branches

        Branch downtown = new Branch();
        ArrayList<Customer> downtownCustomers = new ArrayList<Customer>();
        downtownCustomers.add(customer1);
        downtownCustomers.add(customer2);
        downtown.setCustomers(downtownCustomers);
        System.out.println(downtown.getCustomers().get(1).getCustomername());


        Branch north = new Branch();
        ArrayList<Customer> northCustomers = new ArrayList<Customer>();
        northCustomers.add(customer3);
        north.setCustomers(northCustomers);



//        Bank(s)


        Bank usaa = new Bank();
        usaa.getBranches().add(downtown);
        usaa.getBranches().add(north);



//          Things to do

//        downtown customers sout

        for (int i = 0; i < (downtownCustomers.size()) - 1; i++) {
            System.out.println(downtown.getCustomers().get(i).getCustomername());
        }



    }
}
