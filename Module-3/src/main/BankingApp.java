package main;

/*
@author: Priyanka Hatgine
 */

import exception.AccountNotFoundException;
import exception.InSufficientBalanceException;
import model.Account;
import model.CurrentAccount;
import model.SavingAccount;

import java.util.Scanner;

public class BankingApp {
    private static final Scanner sc = new Scanner(System.in);

    private static int menuList() {
        System.out.println("0.Exit");
        System.out.println("1.Add Account");
        System.out.println("2.Display All Accounts");
        System.out.println("3.withdraw");
        System.out.println("4.deposit");
        System.out.print("Enter choice	:	");
        return sc.nextInt();
    }

    private static int accountTypeMenu() {
        System.out.println("1.SB Account");
        System.out.println("2.Current Account");
        return sc.nextInt();
    }

    private static void userInput() {
        int choice = 0;
        while ((choice = menuList()) != 0) {
            switch (choice) {
                case 1:
                    switch (accountTypeMenu()) {
                        case 1:
                            Account sbAcc = new SavingAccount();
                            sbAcc.addAccount();
                            break;
                        case 2:
                            Account currAcc = new CurrentAccount();
                            currAcc.addAccount();
                            break;
                    }
                    break;
                case 2:
                    try {
                        switch (accountTypeMenu()) {
                            case 1:
                                Account sbAcc = new SavingAccount();
                                sbAcc.displayAllAccounts();
                                break;
                            case 2:
                                Account currAcc = new CurrentAccount();
                                currAcc.displayAllAccounts();
                                break;
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        Account acc = null;
                        switch (accountTypeMenu()) {
                            case 1:
                                acc = new SavingAccount();
                                break;
                            case 2:
                                acc = new CurrentAccount();
                                break;
                        }
                        System.out.println("Enter Account Number : ");
                        String accountNumber = sc.nextLine();
                        acc.withdraw(accountNumber);

                    } catch (AccountNotFoundException | InSufficientBalanceException ex) {
                        ex.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        Account acc = null;
                        switch (accountTypeMenu()) {
                            case 1:
                                acc = new SavingAccount();
                                break;
                            case 2:
                                acc = new CurrentAccount();
                                break;
                        }
                        System.out.println("Enter Account Number : ");
                        String accountNumber = sc.nextLine();
                        acc.deposit(accountNumber);
                    } catch (AccountNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    break;
            }
        }
    }


    public static void main(String[] args) {
        userInput();
    }
}
