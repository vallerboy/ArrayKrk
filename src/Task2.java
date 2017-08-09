/**
 * Created by Lenovo on 09.08.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int[]  myArray = {1,2,3,4,5,25,134,14,14,531,4,14,13,4,11,232,14};

        int min = Integer.MAX_VALUE;
        for(int local : myArray) {
            if(local < min){
                min = local;
            }
        }
        System.out.println(min);
    }
}
