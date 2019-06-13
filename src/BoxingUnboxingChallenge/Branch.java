package BoxingUnboxingChallenge;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;

    public Branch() {
    }

    public Branch(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
