import java.util.Scanner;

public class lchm_09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Length  :" );
        int length = scanner.nextInt();
        System.out.print("Width :");
        int width = scanner.nextInt();
        System.out.printf("Area of rectangle is %d\n ", length*width);
        scanner.close();

    }
}
