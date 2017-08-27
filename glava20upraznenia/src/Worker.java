
public class Worker extends Human implements Comparable{
    private int wage;
    private int workHours;

    public Worker(String firstName, String lastName, int wage, int workHours) {
        super(firstName, lastName);
        this.wage = wage;
        this.workHours = workHours;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int wagePerHours(int wage, int hours) {
        int sum;
        int week = hours * 5;
        sum = wage / week;
        return sum;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
