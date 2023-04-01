public class ATM {
private Account account;

public ATM(Account account) {
    this.account = account;
}


public Account getAccount() {
    return account;
}

public void setAccount(Account account) {
    this.account = account;
}

public void deposit(double amount) {
    account.credit(amount);
}

public void withdraw(double amount) {
    account.debit(amount);
}

public void transfer(double amount, Account another) {
    account.transferTo(another, amount);
}
}

