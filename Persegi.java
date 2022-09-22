public class Persegi implements LuasKelilingBangunDatar {
    double s;

    public Persegi(double sisi) {
        this.s = sisi;
    }

    @Override
    public void keliling() {
        double keliling = 4 * s;
        System.out.println("Keliling Persegi adalah " + keliling);
    }

    @Override
    public void luas() {
        double luas = s * s;
        System.out.println("Luas Persegi adalah " + luas);
    }

}