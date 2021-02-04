
package TugasPraktikum3;

import java.util.Scanner;

public class Kendaraan {
    /*  menggunakan string karena menjaga-jaga apabila ada jenis mobil yang menggunakan angka dan kata
        menjaga juga apabila user memasukkan satuan*/
    
    static void  merek(){
        Scanner masuk = new Scanner(System.in);
        System.out.println("Masukkan merek :" + " ");
        String nama = masuk.nextLine();
        System.out.println(nama);
    }
    static void  mesin(){
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan akselerasi mesin :" + " ");
        String akselerasi = masuk.nextLine();
        System.out.println(akselerasi);
        System.out.print("Masukkan kapasitas tenaga:"+ " ");
        String tenaga = masuk.nextLine();
        System.out.println(tenaga);
        System.out.print("Masukkan kecepatan :"+ " ");
        String kecepatan = masuk.nextLine();
        System.out.println(kecepatan);        
        System.out.print("Masukkan torsi :"+ " ");
        String torsi = masuk.nextLine();
        System.out.println(torsi); 
    }   
    static void bensin(){
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan mesin bensin:" + " ");
        String bensin = masuk.nextLine();
        System.out.println(bensin);
        System.out.print("Masukkan konsumsi bensin:" + " ");
        String konsumsi = masuk.nextLine();
        System.out.println(konsumsi);
    }
    static void deskripsi (){
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan tahun keluar:" + " ");
        String tahun = masuk.nextLine();
        System.out.println(tahun);
        System.out.print("Masukkan harga:" + " ");
        String harga = masuk.nextLine();
        System.out.println(harga);
    }
    
}

    