
package TugasPraktikum1;
//mengimport package java util
import java.util.Scanner;

/* Class untuk menhitung persegi*/

public class Persegi {
    //membuat fields
     int inputSisi, luas;
     
    //method void untuk memasukkan nilai dari sisi persegi
     void input (){ 
    
        Scanner masuk = new Scanner(System.in);
        System.out.println("Masukkan panjang sisi persegi:" + " ");
        inputSisi = masuk.nextInt();
        //memanggil method luas agar mudah memanggil method input di main method
        luas();
    }
     
     //membuat method untuk menghitung nilai luas persegi
     void luas (){
         luas = inputSisi*inputSisi;
         System.out.print("Luas persegi adalah :" +" ");
         System.out.println(luas);
    }
}
