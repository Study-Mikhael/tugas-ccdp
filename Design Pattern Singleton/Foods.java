public class Foods {
    // Instance tunggal dari kelas Foods
    private static Foods instance;

    // Constructor private untuk mencegah instantiasi langsung
    private Foods() {
        // Inisialisasi jika diperlukan
    }

    // Metode untuk mendapatkan instance tunggal
    public static Foods getFoods() {
        if (instance == null) {
            instance = new Foods();
        }
        return instance;
    }

    // Metode contoh untuk melakukan sesuatu
    public void doSomething() {
        System.out.println("Doing something in Foods class.");
    }
}