import java.util.Scanner;

/**
 * Created by Lenovo on 09.08.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ciąg A: ");
        String[] ints = scanner.nextLine().split(" ");

        int localSum;
        for(int i = 0; i < ints.length; i++){
            localSum = 0;
            for(int x = i; x < ints.length; x++){
                localSum += Integer.parseInt(ints[x]);
            }
            System.out.println("B od " + (i + 1) + ": " + localSum);
        }
    }
}
