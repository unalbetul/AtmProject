package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ATM atm = new ATM();
        Account account = new Account("Betul", "12345", 5000);

        atm.calis(account);
        System.out.println("Programdan çıkılıyor.");
    }
}
