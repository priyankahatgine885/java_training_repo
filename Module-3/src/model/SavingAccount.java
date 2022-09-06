package model;

import exception.AccountNotFoundException;
import exception.InSufficientBalanceException;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
final public class SavingAccount extends Account {
    private static double perMonthInterestRate = 0.04;
    final private static Integer minBalance = 1000;
    private final double balance = 0;
    private static List<Account> accountList;

    static {
        accountList = new ArrayList<>();
    }

    Scanner sc = new Scanner(System.in);

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;

    }

    @Override
    public void addAccount() {
        Account account = new SavingAccount();
        System.out.print("Enter Account No: ");
        account.setAccount_number(String.valueOf(sc.nextInt()));
        sc.nextLine();
        System.out.print("Enter Name: ");
        account.setName(sc.nextLine());
        System.out.print("Enter Balance: ");
        account.setAmount(sc.nextLong());
        accountList.add(account);
    }

    @Override
    public void displayAllAccounts() {
        if (accountList != null) {
            for (Account account : accountList) {
                System.out.println("----------------------------");
                System.out.println("Account No: " + account.getAccount_number());
                System.out.println("Account Name: " + account.getName());
                System.out.println("Account Balance: " + account.getAmount());
                System.out.println("----------------------------");
            }
        } else {
            System.out.println("No any accounts. Please add account.");
        }
    }

    @Override
    public void withdraw(String accountNumber) throws InSufficientBalanceException, AccountNotFoundException {
        long amount;
        double balance;
        System.out.println("Enter Amount you Want to withdraw : ");
        amount = sc.nextLong();
        if (accountList != null) {
            for (Account account : accountList) {
                if (account.getName().equals(accountNumber)) {
                    if (account.getAmount() >= amount) {
                        balance = account.getAmount() - amount;
                        account.setAmount(balance);
                        System.out.println(account.toString());
                        break;
                    } else {
                        throw new InSufficientBalanceException("Less Balance..Transaction Failed..");
                    }
                }
                System.out.println("Account Number Not Found");
            }
        }
    }

    @Override
    public void deposit(String accountNumber) throws AccountNotFoundException {
        long amount;
        double balance;
        System.out.println("Enter Amount you Want to Deposit : ");
        amount = sc.nextLong();
        if (accountList != null) {
            for (Account account : accountList) {
                if (account != null) {
                    if (account.getAccount_number().equals(accountNumber)) {
                        balance = account.getAmount() + amount;
                        account.setAmount(balance);
                        System.out.println(account.toString());
                        break;
                    }
                }
            }
        }
        System.out.println("Account Number Not Exist");
    }

    public static void modifyInterestRate(double newInterestRate) {
        perMonthInterestRate = newInterestRate;
    }
}