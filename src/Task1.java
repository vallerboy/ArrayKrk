import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź rozmiar tablicy: ");
        int arraySize = scanner.nextInt();

        int[] myArray = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            System.out.print("Wpisz liczbę: ");
            myArray[i] = scanner.nextInt();
        }

        for(int i = myArray.length - 1; i >= 0; i--){
            System.out.println(myArray[i]);
        }

    }
}
