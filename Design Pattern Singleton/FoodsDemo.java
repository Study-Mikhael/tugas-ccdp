public class FoodsDemo {
    public static void main(String[] args) {
        // Mendapatkan instance tunggal dari Foods
        Foods foodsInstance = Foods.getFoods();

        // Memanggil metode doSomething
        foodsInstance.doSomething();

        // Memverifikasi bahwa instance yang sama digunakan
        Foods anotherFoodsInstance = Foods.getFoods();
        System.out.println("Are both instances the same? " + (foodsInstance == anotherFoodsInstance));
    }
}