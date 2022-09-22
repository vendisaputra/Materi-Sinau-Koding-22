
public class Main {

    public static void main(String[] args) {

        // Contoh Abstract
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);
        persegiPanjang.kelilingPersegiPanjang(15, 10);
        persegiPanjang.luasPersegiPanjang(15, 10);

        // Contoh Interface
        Persegi persegi = new Persegi(10);
        persegi.keliling();
        persegi.luas();
    }

}
