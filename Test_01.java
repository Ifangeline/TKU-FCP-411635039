import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class Test_01 {
    public static void main(String[] args) {
        double r = 5.0;
        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;

        System.out.printf("Area : %.2f\n", area);
        System.out.printf("Circumference : %.2f\n", circumference);

    }
}
