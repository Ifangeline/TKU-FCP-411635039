import java.util.Scanner;

public class hm_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int arr[] = {17,48,30,74,62,55,32,67,77,83};
        int max = arr[0];


        for(int i:arr) {
            if(i>max)
            max=i;
        }
        
        System.out.printf("Maximum is %d", max);
    }
}
       

