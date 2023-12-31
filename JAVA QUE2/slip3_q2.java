import java.util.Scanner;

class Account {
    int ano;
    String aname;
    float balance;

    Account(int ano, String aname, float balance) {
        this.ano = ano;
        this.aname = aname;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + ano);
        System.out.println("Account Name: " + aname);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class slip3_q2 {
    static void sortAcc(Account a[], int n) {
        Account temp;
        System.out.println("Displaying accounts in sorted order: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].balance > a[j].balance) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            a[i].display();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many members: ");
        int n = sc.nextInt();
        Account a[] = new Account[n];
        System.out.println("Enter " + n + " account details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Account no: ");
            int ano = sc.nextInt();
            System.out.println("Account name: ");
            String aname = sc.next();
            System.out.println("Account balance: ");
            float balance = sc.nextFloat(); // Change the type to float
            a[i] = new Account(ano, aname, balance);
        }
        System.out.println("Displaying details: ");
        for (int i = 0; i < n; i++) {
            a[i].display();
        }
        sortAcc(a, n);
    }
}
