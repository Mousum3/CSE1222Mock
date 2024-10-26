package q1;

public class Supervisor extends Worker {
    protected String division;

    public Supervisor(String name, double wage, String division) {
        super(name, wage);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "division='" + division + '\'' +
                ", name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }
}
