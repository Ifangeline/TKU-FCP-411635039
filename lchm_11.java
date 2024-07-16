import java.util.Scanner;

public class lchm_11 {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Price of chips is $");
        int chips = scanner.nextInt();
        System.out.print("Price of candy is $");
        int candy = scanner.nextInt();
        System.out.print("Price of chocolate is $");
        int choco = scanner.nextInt();
        System.out.println("Total price of 3 items are $" +(chips+candy+choco));
        scanner.close();


    }

}
