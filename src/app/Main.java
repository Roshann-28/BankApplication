package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to Console Bank");
        while (running) {
            System.out.println("""
                    1) Open Account
                    2) Deposit
                    3) Withdraw
                    4) Transfer
                    5) Account Statement
                    6) List Accounts
                    7) Search Accounts by Customer Name
                    0) Exit
                    """);
            System.out.println("Choose(0-7): ");
            String choice = sc.nextLine().trim();
            System.out.println("Option Chosen: " + choice);

            switch (choice) {
                case "0" -> running = false;
//                case "1" -> ;
//                case "2" -> ;
//                case "3" -> ;
//                case "4" -> ;
//                case "5" -> ;
//                case "6" -> ;
//                case "7" -> ;
            }
        }




        }
}
