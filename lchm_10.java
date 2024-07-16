import java.util.Scanner;

public class lchm_10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Fahrenheit degree  :" );
        int F = scanner.nextInt();
        double C = (F - 32) * 5/9;
        
        System.out.println(F+ " Fahrenheit equals to" +C+ " Celcius");
        scanner.close();

    }

}
