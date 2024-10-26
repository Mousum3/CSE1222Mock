package q1;

public class Worker {
    protected String name;
    protected double wage;

    public Worker(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }
}
