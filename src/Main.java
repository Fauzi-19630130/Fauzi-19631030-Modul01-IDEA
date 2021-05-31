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
        System.out.println(uniskaString);

        String namaLengkap = namaDepan;
        System.out.println(namaLengkap.length());

    }
}
