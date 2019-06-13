package BoxingUnboxingChallenge;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer() {
    }

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public Customer(String customerName, ArrayList<Double> transactions) {
        this.transactions = transactions;
        this.customerName = customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    public String getCustomername() {
        return customerName;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
