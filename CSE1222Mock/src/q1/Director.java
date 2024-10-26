package q1;

public class Director extends Supervisor {
    public Director(String name, double wage, String division) {
        super(name, wage, division);
    }

    @Override
    public String toString() {
        return "Director{" +
                "division='" + division + '\'' +
                ", name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }
}