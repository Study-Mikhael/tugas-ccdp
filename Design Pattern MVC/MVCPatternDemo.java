public class MVCPatternDemo {
    public static void main(String[] args) {

        // Fetch Employee record based on his roll number from the database
        Employee model = retrieveEmployeeFromDatabase();

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Suyatna");
        controller.updateView();
    }

    private static Employee retrieveEmployeeFromDatabase(){
        return new Employee("1","Daniyal", "Bos");
    }
}