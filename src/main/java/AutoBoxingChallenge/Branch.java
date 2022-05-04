package AutoBoxingChallenge;

import java.util.ArrayList;

public class Branch {

    public String getBranchName() {
        return branchName;
    }

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        } else {
            System.out.println("Customer already exists");
            return false;
        }

    }

    public boolean addTransactionsToCustomer(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        } else {
            System.out.println("Record does not exist");
            return false;
        }
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            //See what below line gets you !!!
            //I would have thought that returns a value and not a
            //customer object
            Customer existingCustomer = customers.get(i);
            if (existingCustomer.getCustomerName().equals(customerName)) {
                return existingCustomer;
            }
        }
        return null;
    }

}
