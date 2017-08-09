import java.util.Scanner;

/**
 * Created by Lenovo on 08.08.2017.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[5];
        String[] names = {"Ania", "Tomek", "Kinga"};

        arrayOfInts[0] = 142;
        arrayOfInts[1] = 1245;
        arrayOfInts[2] = 21512;
        arrayOfInts[3] = 613;
        arrayOfInts[4] = 12515;


//        for(int i = 0; i < arrayOfInts.length; i++){
//            System.out.println(arrayOfInts[i]);
//        }
//
//        int index = 0;
//        for(int helpVar : arrayOfInts){
//            System.out.println(helpVar);
//            index++;
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczby do tablicy oddzielone spacją: ");

        String[] numbers = scanner.nextLine().split(" ");

        for (String number : numbers) {
            System.out.println(number);
        }

        int[][] arrays = new int[3][3];
        arrays[0][1] = 5;
        arrays[0][2] = 6;
        arrays[1][1] = 5;

        int[][][][] arraysNew = { {{{1,2},{1,2}}, {{1,2,3}, {1,2,3}}}};

    }
}
