package AutoBoxingChallenge;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch(String branchName) {
        if (existingBranch(branchName)) {
            System.out.println("Branch already exists");
        } else {
            branches.add(new Branch(branchName));
        }
    }

    public void addCustomer(String branchName, String customerName, double initialAmount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch == null) {
            System.out.println("Branch does not exist");
        } else {
            existingBranch.addNewCustomer(customerName, initialAmount);
        }
    }

    public void addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch == null) {
            System.out.println("Branch does not exist");
        } else {
            existingBranch.addTransactionsToCustomer(customerName, amount);
        }
    }

    public boolean existingBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) {
                System.out.println("This branch already exists");
                return true;
            }
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public void listOfCustomersAndTransactions(){
        for (int i=0; i< branches.size(); i++){
            for (int a=0; a<branches.get(i).getCustomers().size(); a++){
                System.out.println(branches.get(i).getCustomers().get(a).getCustomerName() + branches.get(i).getCustomers().get(a).getTransactionsList());
            }
        }
    }

}
