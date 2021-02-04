
package TugasPraktikum2;

//membuat class pohon

import java.util.Scanner;

public class Pohon {
    //variabel instance
    String nama;
    int tinggi;
    
    //method void nama
    void setNama(){       
        Scanner masuk = new Scanner(System.in);
        System.out.println("Masukkan jenis pohon:" + " ");
        nama = masuk.nextLine();
        System.out.println(getNama());
    }
  //method void tinggi  
    void setTinggi(){
        Scanner masuk = new Scanner(System.in);
        System.out.println("Masukkan tinggi pohon:" + " ");
        tinggi = masuk.nextInt();
        System.out.println(getTinggi());
        
       
    }
    //non void method mengembalikan nilai nama dan tinggi
    String getNama(){
        return nama;
    }
    int getTinggi(){
        return tinggi;
    }
}

