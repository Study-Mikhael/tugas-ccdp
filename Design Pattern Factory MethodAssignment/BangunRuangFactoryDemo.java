
public class BangunRuangFactoryDemo {
    public static void main(String[] args) {
        BangunRuangFactory factory = new BangunRuangFactory();

        BangunRuang kubus = factory.getBangunRuang("Kubus", 5.0);
        kubus.gambar();
        System.out.println("Volume Kubus: " + kubus.hitungVolume());

        BangunRuang balok = factory.getBangunRuang("Balok", 4.0, 3.0, 2.0);
        balok.gambar();
        System.out.println("Volume Balok: " + balok.hitungVolume());
    }
}

abstract class BangunRuang {
    public abstract void gambar();
    public abstract double hitungVolume();
}

class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void gambar() {
        System.out.println("Menggambar Kubus");
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
}

class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public void gambar() {
        System.out.println("Menggambar Balok");
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class BangunRuangFactory {
    public BangunRuang getBangunRuang(String namaBangunRuang, double... parameters) {
        if (namaBangunRuang.equalsIgnoreCase("Kubus")) {
            return new Kubus(parameters[0]);
        } else if (namaBangunRuang.equalsIgnoreCase("Balok")) {
            return new Balok(parameters[0], parameters[1], parameters[2]);
        }
        return null;
    }
}