import java.util.Scanner;

public class hm_08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("What's your name?");
        String name=scanner.next();
        System.out.print("How old are you?");
        int age = scanner.nextInt();
        System.out.print("Where are you from?");
        String country=scanner.next();
        System.out.print(name+ ", "+age+" years old , From " +country);
        scanner.close();

    }
}
