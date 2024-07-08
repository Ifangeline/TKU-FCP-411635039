import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class hm_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Input first integer :" );
        int first=scanner.nextInt();
        System.out.print("Input second integer :");
        int second = scanner.nextInt();
        System.out.println(first+"+"+second+"="+(first+second));
        scanner.close();

    }

}