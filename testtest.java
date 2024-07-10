import java.util.Scanner;

public class testtest {  
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    char char1 = scanner.next().charAt(0);
    double result;
    switch (char1) {
        case '+':
            result = num1 + num2;
            System.out.println((int) result);
            break;
        case '-':
            result = num1 - num2;
            System.out.println((int) result);
            break;
        case '*':
            result = num1 * num2;
            System.out.println((int) result);
            break;
        case '/':
            if (num2 != 0) {
                result = (double) num1 / num2;
                System.out.printf("%.2f\n", result);
            } else {
                System.out.println("Error");
            }
            break;
        }

  }
}