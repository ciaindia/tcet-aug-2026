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

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

}

class HDFC extends Bank {
    public HDFC(int b) {
        super(b);
    }
}

//https://codeinsightacademy.com/blog/programming/oops/
class SBI extends Bank {
    public SBI(int b) {
        super(b);
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount - 50;
    }
}


class Main {
    public static void main(String[] args) {
        SBI acc2 = new SBI(10000);
        acc2.showBalance();
        acc2.deposit(5000);
        acc2.showBalance();
        acc2.withdraw(2000);
        acc2.showBalance();

        // Bank acc1 = new Bank(1000);
        // acc1.showBalance();
        // acc1.deposit(500);
        // acc1.showBalance();

    }
}