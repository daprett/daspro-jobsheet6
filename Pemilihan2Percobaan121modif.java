import java.util.Scanner;

/**
 * Pemilihan2Percobaan121modif
 */
public class Pemilihan2Percobaan121modif {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        
        int tahun;

        System.out.println("Masukkan tahun: ");
        tahun = input21.nextInt();

        String jenis = "Bukan Tahun Kabisat";
        if ((tahun %4)==0){
            if ((tahun %100)!=0)
            jenis = "Tahun Kabisat";
            else {
                if ((tahun %400)==0)
                jenis = "Tahun Kabisat";
                System.out.println(jenis);
            }
        }
    }

}