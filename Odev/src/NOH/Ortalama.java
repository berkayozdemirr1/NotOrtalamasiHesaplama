//Package ismi

package NOH;

//Scanner Sınıfını Sisteme Dahil Edeceğim.

import java.util.Scanner;

//Değişkenleri Oluşturacağım.

public class Ortalama {
    public static void main(String[] args) {
    int matematik, fizik, kimya,turkce,tarih, muzik;

        Scanner degerler = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        matematik = degerler.nextInt();
        System.out.println(matematik);

        System.out.print("Fizik Notunuz : ");
        fizik = degerler.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya Notunuz : ");
        kimya = degerler.nextInt();
        System.out.println(kimya);

        System.out.print("Turkce Notunuz : ");
        turkce = degerler.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih Notunuz : ");
        tarih = degerler.nextInt();
        System.out.println(tarih);

        System.out.print("Muzik Notunuz : ");
        muzik = degerler.nextInt();
        System.out.println(muzik);

        //Ortalama Hesabı

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam/6.0;
        System.out.println("Ortalamaniz : " + sonuc);

        //Sınıf Geçme DERDİ :D

        boolean dert = sonuc >= 60;
        String sinifgecme = dert ? "Sinifi Gectin" : "Sinifta Kaldin";
        System.out.println(sinifgecme);

    }
}
