import java.util.Scanner;

/**
 * Pemilihan2Percobaan221
 */
public class Pemilihan2Percobaan221 {

    public static void main(String[] args) {
        //deklarasi scanner
        Scanner input21 = new Scanner(System.in);

        //deklarasi variabel(preparation)
        float sudut1, sudut2, sudut3, totalSudut;

        //input
        System.out.println("Masukkan sudut 1: ");
        sudut1 = input21.nextFloat(); 
        System.out.println("Masukkan sudut 2: ");
        sudut2 = input21.nextFloat();
        System.out.println("Masukkan sudut 3: ");
        sudut3 = input21.nextFloat();

        //process
        totalSudut = sudut1 + sudut2 + sudut3;

        //pemilihan 
        if (totalSudut == 180) {
             if ((sudut1 == 90) || (sudut2 == 90 ) || (sudut3 == 90 ))
            System.out.println("Segitiga tersebut adalah segitiga siku siku");
            else if ((sudut1 == 70) || (sudut2 == 70) || (sudut3 == 40))
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60))
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else {
            System.out.println("Bukan segitiga");
        }


    }
}