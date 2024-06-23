public class p9 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savings = new SavingsAccount(5000);
        CheckingAccount checking = new CheckingAccount(3000);

        Transaction transaction = new Transaction();

        transaction.performTransaction(savings, 1000, true);  // Deposit
        transaction.performTransaction(checking, 500, false); // Withdraw

        System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());
    }

    static class Bank {
        private static int totalAccounts = 0;

        public Bank() {
            totalAccounts++;
        }

        public static int getTotalAccounts() {
            return totalAccounts;
        }
    }

    static abstract class Account {
        protected double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public abstract void deposit(double amount);
        public abstract void withdraw(double amount);
        public abstract double getBalance();
    }

    static class SavingsAccount extends Account {
        public SavingsAccount(double balance) {
            super(balance);
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
        }

        @Override
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }
    }

    static class CheckingAccount extends Account {
        public CheckingAccount(double balance) {
            super(balance);
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
        }

        @Override
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }
    }

    static class Transaction {
        private final double transactionFee = 1.00;

        public final void performTransaction(Account account, double amount, boolean isDeposit) {
            if (isDeposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
            account.withdraw(transactionFee); // Deducting transaction fee
            System.out.println("Transaction successful. Current Balance: " + account.getBalance());
        }
    }
}
