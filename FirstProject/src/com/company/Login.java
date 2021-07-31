package com.company;

import java.util.Scanner;

public class Login {
    public boolean login(Account account) {
        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.println("Kullanıcı adı giriniz:");
        kullanici_adi = scanner.nextLine();
        System.out.println("Parola giriniz:");
        parola = scanner.nextLine();

        if(account.getKullanici_adi().equals(kullanici_adi)){
            return true;
        }
        if(account.getParola().equals(parola)){
            return true;
        }
        else{
            System.out.println("Kullanıcı adı veye parolası yanlış.");
            return false;
        }
    }

}
