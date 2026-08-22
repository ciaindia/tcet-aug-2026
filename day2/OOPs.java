class Bank {
    int balance;

    public Bank(int b) {
        this.balance = b;
    }

    public void showBalance() {
        System.out.println("Balance: " + this.balance);
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

}

class Main {
    public static void main(String[] args) {
        Bank acc1 = new Bank(1000);
        acc1.showBalance();
        acc1.deposit(500);
        acc1.showBalance();
    }
}