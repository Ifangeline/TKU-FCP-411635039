import java.util.Scanner;

public class ch3_13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("What's your name?");
        String name=scanner.next();
        System.out.print("How old are you?");
        int age = scanner.nextInt();
        System.out.print(name+ ", "+age+" years old.");
        scanner.close();

    }
}
 