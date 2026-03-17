package slide2;

public class Employee {
    private String id;
    private String name;
    protected double basicSalary;

    public Employee(String id, String name, double basicSalary) {
        setId(id);
        setName(name);
        setBasicSalary(basicSalary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            this.id = "ko co";
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary >= 0) {
            this.basicSalary = basicSalary;
        } else {
            this.basicSalary = 0;
        }
    }

    public double income() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Income: " + income();
    }
}
