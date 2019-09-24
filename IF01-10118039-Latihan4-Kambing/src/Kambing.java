/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang digunakan untuk pembelajaran variabel  
 */

public class Kambing {

    public void tambahKambing() {
        //Deklarasi Variabel Lokal
        int jumlahKambing = 0;
        
        jumlahKambing=jumlahKambing+5;
        System.out.println("Jumlah Kambing setelah ditambah adalah : "+jumlahKambing);
    }

    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
        
    }

}
