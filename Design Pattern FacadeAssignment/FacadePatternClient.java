public class FacadePatternClient {
    public static void main(String[] args) {
        ShopKeeper sk = new ShopKeeper();

        sk.asusSale();
        sk.xiaomiSale();
        sk.samsungSale();
    }
}