import java.util.Scanner;

/**
 * Created by Lenovo on 09.08.2017.
 */
public class Task7  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ints = scanner.nextLine().split("m");

        int counter;
        for(int i = 0; i < ints.length; i++) {
            counter = 0;
            for(int x = 0; x < ints.length; x++){
                if(ints[i].equals(ints[x])){
                    counter++;
                }
            }
            if(counter >= 3){
                System.out.println("TAK");
                break;
            }
        }
    }
}
