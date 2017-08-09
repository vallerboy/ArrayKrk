/**
 * Created by Lenovo on 09.08.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] ints = {1,1,1,1,34,1,42,1,4,124,2,2,2,2,142421,41123};

        int maxCounter = Integer.MIN_VALUE;
        int valueNumber = 0;
        int counter;

        for (int i = 0; i < ints.length; i++) {
            counter = 0;
            if(ints[i] == valueNumber){
                continue;
            }

            for (int anInt : ints) {
                if(ints[i] == anInt){
                    counter++;
                }
            }
            if(maxCounter < counter){
                valueNumber = ints[i];
                maxCounter = counter;
            }
        }

        System.out.println(valueNumber);

    }
}
