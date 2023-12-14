import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /**  Scanner sc = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Lütfen geçerli bir sayı girin.");
        } else {
            int sayi;
            int enBuyuk;
            int enKucuk;
            System.out.print("1. Sayıyı giriniz: ");
            sayi = sc.nextInt();
            enBuyuk = sayi;
            enKucuk = sayi;
            for (int i = 2; i <= n; i++) {
                System.out.print(i + ". Sayıyı giriniz: ");
                sayi = sc.nextInt();
                // En büyük sayıyı güncelle
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }
                // En küçük sayıyı güncelle
                if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
            }
            System.out.println("En büyük sayı: " + enBuyuk);
            System.out.println("En küçük sayı: " + enKucuk);
        } */
       /* Scanner sc = new Scanner(System.in);
        int cem =0;
                System.out.print("Ededi daxil edin: ");
        int n = sc.nextInt();
                for(int i=1; i<n; i++){
                    if(n%i==0){
                         cem = i+cem;

                    }
                } if(cem==n){
            System.out.println(n+" Mukemmel ededdir");
        }else{
            System.out.println(n+" Mukemmel eded deyil");
        }*/


               /** Scanner sc = new Scanner(System.in);
                System.out.print("Basamak sayısını giriniz: ");
                int basamakSayisi = sc.nextInt();
                // Ters üçgen çizme döngüsü
                for (int i = 1; i <= basamakSayisi; i++) {
                    // Her satırda i-1 kadar boşluk bırak
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    // Her satırda basamakSayisi - i + 1 kadar yıldız çiz
                    for (int k = i; k <= basamakSayisi; k++) {
                        System.out.print("*");
                    }
                    // Bir satır aşağı geç
                    System.out.println();
                } */

            }
        }



