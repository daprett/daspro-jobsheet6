import java.util.Scanner;

/**
 * Pemilihan2Percobaan121
 */
public class Pemilihan2Percobaan121 {

    public static void main(String[] args) {
            // deklarasi scanner
        Scanner input21 = new Scanner(System.in);

            //deklarasi variable(preparation)
        int tahun;
        
            // input 
        System.out.println("Masukkan tahun: ");
        tahun = input21.nextInt();

            //pemilihan 
        if ((tahun % 4 ) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun Kabisat");
            else 
            System.out.println("Bukan Tahun kabisat"); 
        } 

    }
}