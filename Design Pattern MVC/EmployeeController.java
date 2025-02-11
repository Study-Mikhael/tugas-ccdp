public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }

    public void setEmployeeRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public void setEmployeePosition(String position){
        model.setPosition(position);
    }

    public String getEmployeeName(){
        return model.getName();
    }

    public String getEmployeeRollNo(){
        return model.getRollNo();
    }

    public String getEmployeePosition(){
        return model.getPosition();
    }

    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getRollNo(), model.getPosition());
    }
}