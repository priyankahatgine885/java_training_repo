package model;

import exception.AccountNotFoundException;
import exception.InSufficientBalanceException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Account {
    private String account_number;
    private String name;
    private double amount;

    public abstract void addAccount();

    public abstract void displayAllAccounts();

    public abstract void withdraw(String accountNumber) throws InSufficientBalanceException, AccountNotFoundException;

    public abstract void deposit(String accountNumber) throws AccountNotFoundException;
}

