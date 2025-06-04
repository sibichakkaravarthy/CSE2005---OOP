#include <stdio.h>
#include <string.h>

struct BankAccount {
    char name[50];
    double balance;
};

void createAccount(struct BankAccount *acc, const char *name, double initialBalance) {
    strcpy(acc->name, name);
    acc->balance = initialBalance;
}

void deposit(struct BankAccount *acc, double amount) {
    acc->balance += amount;
}

void withdraw(struct BankAccount *acc, double amount) {
    if (acc->balance >= amount) {
        acc->balance -= amount;
    } else {
        printf("Insufficient funds\n");
    }
}

void showBalance(struct BankAccount *acc) {
    printf("%s's balance: %.2f\n", acc->name, acc->balance);
}

int main() {
    struct BankAccount acc;
    createAccount(&acc, "Alice", 1000);
    deposit(&acc, 500);
    withdraw(&acc, 200);
    showBalance(&acc);

    return 0;
}
