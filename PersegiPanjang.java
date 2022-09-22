public class PersegiPanjang extends LuasKelilingAbstract {
    double p, l;

    public PersegiPanjang(double panjang, double lebar) {
        this.l = lebar;
        this.p = panjang;
    }

    @Override
    void luas() {
        double luas = p * l;
        System.out.println("Luas Persegi Panjang adalah : " + luas);
    }

    @Override
    void keliling() {
        double keliling = 2 * (p * l);
        System.out.println("Keliling Persegi Panjang adalah : " + keliling);
    }
}
