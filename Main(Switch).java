import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int menu = 0;

        while (menu != 3) {

            System.out.println("============MENU============");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Keluar");

            System.out.print("Masukan pilihan menu : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    persegi();
                    break;
                case 2:
                    //persegi panjang
                    break;
                case 3:
                    //segitiga
                    break;

                default:
                    System.out.println("Pilihan tidak sesuai!!");
                    break;
            }
        }
    }

    public static void persegi() {

        int menuPersegi = 0;

        while (menuPersegi != 3) {

            System.out.println("\n\n==============Menu Persegi============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuPersegi = input.nextInt();

            if (menuPersegi == 1) {
                System.out.print("Masukan sisi persegi : ");
                double sisi = input.nextDouble();
                System.out.println("Luas persegi adalah : " + hitungLuasPersegi(sisi));
                System.out.println("\n\n");
            } else if (menuPersegi == 2) {
                // keliling
            }
        }

    }

    public static double hitungLuasPersegi(double s) {
        return s * s;
    }

}