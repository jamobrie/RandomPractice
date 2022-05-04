package AutoBoxingChallenge;

import java.util.ArrayList;

public class Customer {



    private String customerName;
    private ArrayList<Double> transactionsList;

    public Customer(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transactionsList = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void  addTransaction(double amount) {
        this.transactionsList.add(amount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactionsList() {
        return transactionsList;
    }

}
