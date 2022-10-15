import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] cir = new ComparableCircle[3];
        cir[0] = new ComparableCircle();
        cir[1] = new ComparableCircle(6.9);
        cir[2] = new ComparableCircle(3.9, "red", true);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : cir) {
            System.out.println(circle);
        }

        Arrays.sort(cir);
        System.out.println("After-sorted:");
        for (ComparableCircle circle : cir) {
            System.out.println(circle);
        }

        System.out.println(cir[0].compareTo(cir[2]));
        System.out.println(cir[0].compareTo(cir[1]));
        System.out.println(cir[1].compareTo(cir[0]));
        System.out.println(cir[1].compareTo(cir[2]));
        System.out.println(cir[2].compareTo(cir[0]));
        System.out.println(cir[2].compareTo(cir[1]));
        System.out.println(cir[0].compareTo(cir[0]));
    }
}