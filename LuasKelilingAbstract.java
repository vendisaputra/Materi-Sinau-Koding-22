public abstract class LuasKelilingAbstract {
    abstract void luas();

    abstract void keliling();

    void luasPersegiPanjang(double p, double l) {
        double luas = p * l;
        System.out.println("Luas Persegi Panjang adalah : " + luas);
    }

    void kelilingPersegiPanjang(double p, double l) {
        double keliling = 2 * (p * l);
        System.out.println("Keliling Persegi Panjang adalah : " + keliling);
    }
}
