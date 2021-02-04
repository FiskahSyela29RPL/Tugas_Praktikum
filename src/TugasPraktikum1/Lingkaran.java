
package TugasPraktikum1;

import java.util.Scanner;

/*Method untuk menghitung luas lingkaran*/

public class Lingkaran {
    //membuat fields
     double inputJari, luas;
     
    //method void untuk memasukkan nilai dari sisi persegi
     void input (){ 
    
        Scanner masuk = new Scanner(System.in);
        System.out.println("Masukkan nilai jari-jari lingkaran:" + " ");
        inputJari = masuk.nextDouble();
        //memanggil method luas agar mudah memanggil method input di main method
        luas();
    }
     
     //membuat method untuk menghitung nilai luas persegi
     void luas (){
         luas =Math.PI *inputJari*inputJari;
         System.out.print("Luas lingkaran adalah :" +" ");
         System.out.println(luas);
    }
}
