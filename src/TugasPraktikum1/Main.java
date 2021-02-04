
/* jawaban tugas praktikum 1 berisi program untuk menghitung luas lingkaran dan persegi*/
package TugasPraktikum1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //menu awal dan memasukkan input piliha user       
        System.out.println("=========================================");
        System.out.println("| Hitung Luas Bangun Datar Persegi dan Lingkaran|");
        System.out.println("=========================================");
        int pilihan;
                
        //perulangan agar program diulang
        do {
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Keluar");
            
            Scanner masuk = new Scanner(System.in);
            pilihan = masuk.nextInt();
            //membuat percabangan untuk pilihan user
            
            if (pilihan==1){
                //membuat objek
                Persegi Persegi = new Persegi();
                //memanggil method input
                 Persegi.input();
            } else if (pilihan==2) {
                //membuat objek
                Lingkaran lingkaran = new Lingkaran();
                //memanggil method input
                lingkaran.input();
            } else if (pilihan ==3){
                System.out.println("Masukkan 1 dan 2 untuk menghitung");
            } else
                System.out.println("Terima Kasih");                
         
        }while (pilihan !=3);
               
    }
}
