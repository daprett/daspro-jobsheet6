import java.util.Scanner;

/**
 * Pemilihan2Percobaan321
 */
public class Pemilihan2Percobaan321 {

    public static void main(String[] args) {
        //deklarasi Scanner 
        Scanner input21 = new Scanner(System.in);

        //Preparation
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        //Input
        System.out.println("Masukkan kategori: ");
        kategori = input21.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan: ");
        penghasilan = input21.nextInt();

        //pemilihan dan proses 
if (kategori.equalsIgnoreCase("pekerja")) {
        if (penghasilan <= 2000000)
            pajak = 0.1;
        else if (penghasilan <= 3000000)
            pajak = 0.15;
        else 
            pajak = 0.2;
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("Penghasilan Bersih : " + gajiBersih);
 } else if (kategori.equalsIgnoreCase("pebisnis")){
    if (penghasilan <= 2500000)
        pajak = 0.15;
    else if (penghasilan <= 3500000)
        pajak = 0.2;
    else 
    pajak = 0.25;
    gajiBersih = (int) (penghasilan - (pajak * penghasilan));
    System.out.print("Penghasilan Bersih : " + gajiBersih);
 } else 
    System.out.println("Masukan kategori salah");
    }
}