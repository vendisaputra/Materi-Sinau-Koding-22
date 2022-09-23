import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Siswa> daftarSiswa = new ArrayList<>();

        System.out.print("Masukan jumlah siswa di kelas: ");
        int jmlSiswa = input.nextInt();

        for (int i = 0; i < jmlSiswa; i++) {
            Siswa siswa = new Siswa();

            System.out.println("Masukan data siswa ke-" + (i + 1));

            System.out.print("Nama : ");
            siswa.setNama(input.next());

            System.out.print("Umur : ");
            siswa.setUmur(input.nextInt());

            System.out.print("Alamat : ");
            siswa.setAlamat(input.next());

            System.out.println("===================================");

            daftarSiswa.add(siswa);
        }

        int no = 1;
        System.out.println("=================== Daftar Siswa ================");
        for (Siswa data : daftarSiswa) {
            System.out.println("Data siswa " + no);
            System.out.println("Nama : " + data.getNama());
            System.out.println("Umur : " + data.getUmur());
            System.out.println("Alamat : " + data.getAlamat());
            System.out.println("------------------------------------------------");

            no++;
        }
        System.out.println("====================================================");

    }
}
