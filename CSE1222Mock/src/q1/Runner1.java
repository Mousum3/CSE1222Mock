package q1;

public class Runner1 {
    public static void main(String[] args) {
        Worker worker = new Worker("Rohim", 50000);
        Supervisor supervisor = new Supervisor("Korim", 75000, "Supervisor");
        Director director = new Director("Solim", 100000, "Director");

        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}

