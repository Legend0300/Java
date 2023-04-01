public class Account {
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account [balance=" + balance + ", id=" + id + ", name=" + name + "]";
    }

    public double credit(double amount) {
        return balance += amount;
    }

    public double debit(double amount) {
        if (amount <= balance) {
            return balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }

    public double transferTo(Account another, double amount) {
        if (amount <= balance) {
            another.balance += amount;
            return balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }


    Food[] foods = new Food[10];
    
}
