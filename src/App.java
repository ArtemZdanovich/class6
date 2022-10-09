import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String args[]) {
        int arr[] = new int[5];
        System.out.println("Введите пять элементов массива");
        Scanner in = new Scanner(System.in);
        for (int i: arr) {
            arr[i] = in.nextInt();
        }
    }
}