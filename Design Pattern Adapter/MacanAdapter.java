public class MacanAdapter implements Singa {
    Macan Macan;

    public MacanAdapter(Macan Macan) {
        this.macan = macan;
    }

    @Override
    public void squeak() {
        macan.makeSound();
    }
}