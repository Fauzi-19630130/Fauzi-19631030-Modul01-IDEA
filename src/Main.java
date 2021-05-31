import javax.swing.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String namaDepan = "Fauzi";

        int usia = 20;
        int targetTanggal = 4;
        double ipk = 3.999;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println(namaDepan);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);

        String namaLengkap = namaDepan;
        System.out.println(namaLengkap);
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("zi"));
        System.out.println(namaLengkap.substring(2));
        System.out.println(namaLengkap.substring(2,4));
        System.out.println(namaLengkap.replace("Fauzi", "Barr"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());

        String namaArray[] = namaLengkap.split("zi");

        for(String nama : namaArray){
            System.out.println(nama);
        }


    }
}
