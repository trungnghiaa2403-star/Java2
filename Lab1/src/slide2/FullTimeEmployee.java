package slide2;

public class FullTimeEmployee extends Employee {
    private double bonus;
    private double penalty;

    public FullTimeEmployee(String id, String name, double basicSalary, double bonus, double penalty) {
        super(id, name, basicSalary);
        setBonus(bonus);
        setPenalty(penalty);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = (bonus >= 0) ? bonus : 0;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = (penalty >= 0) ? penalty : 0;
    }

    @Override
    public double income() {
        return basicSalary + bonus - penalty;
    }
}
