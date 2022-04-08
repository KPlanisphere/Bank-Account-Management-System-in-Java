# Bank Account Management System in Java

This repository contains a Java project that demonstrates the concept of inheritance through a bank account management system. The project includes classes for defining different types of bank accounts, handling user input, and performing operations such as deposits, withdrawals, and displaying account details.

## Features

- **Inheritance**: Demonstrates the concept of inheritance by extending a base class `CuentaBancaria` to derived classes `CuentaAhorro` and `CuentaCorriente`.
- **Bank Account Attributes**: Defines attributes for bank accounts, including common attributes in the base class and specific attributes in derived classes.
- **User Interaction**: Handles user input to create and manage different types of bank accounts.
- **Account Operations**: Provides methods for depositing, withdrawing, and displaying account details.

### Code Snippets

#### Main Class
The main class initializes the program, handles user input, and invokes methods for managing bank account data.

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CuentaBancaria> accounts = new ArrayList<>();

        // Input for Savings Account
        System.out.print("Enter account holder name for savings account: ");
        String holderName = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        CuentaAhorro savingsAccount = new CuentaAhorro(holderName, initialBalance, interestRate);
        accounts.add(savingsAccount);

        // Input for Current Account
        System.out.print("Enter account holder name for current account: ");
        String holderNameCurrent = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalanceCurrent = scanner.nextDouble();
        System.out.print("Enter overdraft limit: ");
        double overdraftLimit = scanner.nextDouble();
        CuentaCorriente currentAccount = new CuentaCorriente(holderNameCurrent, initialBalanceCurrent, overdraftLimit);
        accounts.add(currentAccount);

        // Display data
        System.out.println("List of accounts:");
        for (CuentaBancaria account : accounts) {
            System.out.println(account);
        }
    }
}
```

#### Bank Account Base Class

The `CuentaBancaria` class represents a generic bank account with common attributes such as account holder name and balance.

```java
public class CuentaBancaria {
    protected String holderName;
    protected double balance;

    public CuentaBancaria(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public String toString() {
        return "Account holder: " + holderName + ", Balance: " + balance;
    }
}
```

#### Savings Account Class

The `CuentaAhorro` class extends `CuentaBancaria` and adds attributes specific to a savings account, such as interest rate.

```
public class CuentaAhorro extends CuentaBancaria {
    private double interestRate;

    public CuentaAhorro(String holderName, double balance, double interestRate) {
        super(holderName, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ", Interest Rate: " + interestRate + "%";
    }
}
```

#### Current Account Class

The `CuentaCorriente` class extends `CuentaBancaria` and adds attributes specific to a current account, such as overdraft limit.

```java
public class CuentaCorriente extends CuentaBancaria {
    private double overdraftLimit;

    public CuentaCorriente(String holderName, double balance, double overdraftLimit) {
        super(holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Overdraft Limit: " + overdraftLimit;
    }
}
```

### Usage

1.  Compile the Java files using a Java compiler (e.g., `javac`).
2.  Run the main class (`Main`) to start the program.
3.  Follow the prompts to enter the details of savings and current accounts.
4.  The program will display the list of accounts with their details.

### Classes and Methods

-   `Main`: The main class that handles user input and program execution.
    -   `main(String[] args)`: The entry point of the program.
-   `CuentaBancaria`: A base class representing a generic bank account with attributes and methods for basic account operations.
    -   `CuentaBancaria(String holderName, double balance)`: Constructor that initializes the account's attributes.
    -   `deposit(double amount)`: Method for depositing money into the account.
    -   `withdraw(double amount)`: Method for withdrawing money from the account.
    -   `toString()`: Method that returns the string representation of the account's details.
-   `CuentaAhorro`: A derived class representing a savings account, extending `CuentaBancaria` and adding additional attributes.
    -   `CuentaAhorro(String holderName, double balance, double interestRate)`: Constructor that initializes the savings account's attributes.
    -   `addInterest()`: Method for adding interest to the account.
    -   `toString()`: Method that returns the string representation of the savings account's details, including inherited attributes.
-   `CuentaCorriente`: A derived class representing a current account, extending `CuentaBancaria` and adding additional attributes.
    -   `CuentaCorriente(String holderName, double balance, double overdraftLimit)`: Constructor that initializes the current account's attributes.
    -   `toString()`: Method that returns the string representation of the current account's details, including inherited attributes.