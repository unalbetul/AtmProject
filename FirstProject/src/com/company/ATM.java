package com.company;

import java.util.Scanner;

public class ATM {
    public void calis(Account account){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("HOŞGELDİNİZ");
        System.out.println("Kullnıcı Girişi");

        int giris_hakki = 3;

        while (true){
            if(login.login(account)) {
                System.out.println("Giriş Başarılı");
                break;
            }
            else{
                System.out.println("Giriş Başarısız");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkı:" + giris_hakki);
            }
            if(giris_hakki == 0){
                System.out.println("Giriş Hakkınız Bitti");
                return;
            }
        }
        String islemler = "1.Bakiye Görüntüle\n" +
                          "2.Para Yatır\n"+
                          "3.Para Çek\n"+
                          "Çıkış için 4'e basınız.";
        System.out.println(islemler);

        while (true){
            System.out.println("İşlem Seçiniz");
            String islem = scanner.nextLine();

            if(islem.equals("4")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz:" + account.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutar:");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                account.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar:");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                account.paraCek(tutar);
            }
            else{
                System.out.println("Geçersiz İşlem");
            }
        }
    }
}
