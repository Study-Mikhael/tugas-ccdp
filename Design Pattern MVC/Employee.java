public class Employee {
    private String rollNo;
    private String name;
    private String position;

    public Employee(String rollNo, String name, String position) {
        this.rollNo = rollNo;
        this.name = name;
        this.position = position
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}