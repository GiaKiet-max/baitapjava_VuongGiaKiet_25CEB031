public class Acount25 {

    private int id;
    private Customer25 customer;
    private double balance = 0.0;

    public Acount25(int id, Customer25 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Acount25(int id, Customer25 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer25 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return customer.toString() + "balance=$ " ;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Acount25 deposit(double amount){
        balance = balance + amount;
        return this;
    }

    public Acount25 withdraw(double amount){
        if (balance >= amount){
            System.out.println("subtract amount to balance");
        }else{
            System.out.println("amount withdraw exceeds the current balance!");
        }
        return this;
    }
}
