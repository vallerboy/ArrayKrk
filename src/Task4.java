/**
 * Created by Lenovo on 09.08.2017.
 */
public class Task4 {

    public static void main(String[] args) {
        int[] ints = {1,1,1,1,34,1,42,1,4,124,2,2,2,2,142421,41123};

        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }
        System.out.println("Suma: " + sum);
        System.out.println("Srednia: " + sum/ints.length);
    }
}
