public class AdapterClient {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        PlasticToyDuck singa = new PlasticToyDuck();

        // Bungkus bird dengan birdAdapter sehingga bertingkah laku seperti toy duck
        ToyDuck macanAdapter = new MacanAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.run();
        sparrow.makeSound();

        System.out.println("Singa...");
        singa.roar();

        // bird bertingkah laku seperti toy duck
        System.out.println("MacanAdapter...");
        birdAdapter.roar();
    }
}