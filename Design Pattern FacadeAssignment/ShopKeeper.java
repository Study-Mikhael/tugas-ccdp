public class ShopKeeper {
    private MobileShop asus;
    private MobileShop xiaomi;
    private MobileShop samsung;

    public ShopKeeper() {
        asus = new Asus();
        xiaomi = new Xiaomi();
        samsung = new Samsung();
    }

    public void asusSale() {
        asus.modelNo();
        asus.price();
    }

    public void xiaomiSale() {
        xiaomi.modelNo();
        xiaomi.price();
    }

    public void samsungSale() {
        samsung.modelNo();
        samsung.price();
    }

}