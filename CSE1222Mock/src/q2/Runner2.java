package q2;

public class Runner2 {
    public static void main(String[] args) {
        Solution2 Solution2 = new Solution2(10, 2);
        Solution2.set(0, 0, "Turzo");
        Solution2.set(0, 0, "Tawhid");
        Solution2.set(2, 2, "Tanim");


        System.out.println(Solution2.getDescribedCells());
    }
}
