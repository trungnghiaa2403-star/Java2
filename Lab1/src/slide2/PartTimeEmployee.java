package slide2;

public class PartTimeEmployee extends Employee {
    private double workingHours;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double workingHours, double hourlyRate) {
        super(id, name, 0);
        setWorkingHours(workingHours);
        setHourlyRate(hourlyRate);
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = (workingHours >= 0) ? workingHours : 0;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = (hourlyRate >= 0) ? hourlyRate : 0;
    }

    @Override
    public double income() {
        return workingHours * hourlyRate;
    }
}