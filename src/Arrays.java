/**
 * Created by Lenovo on 08.08.2017.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[5];

        arrayOfInts[0] = 142;
        arrayOfInts[1] = 1245;
        arrayOfInts[2] = 21512;
        arrayOfInts[3] = 613;
        arrayOfInts[4] = 12515;


        for(int i = 0; i < arrayOfInts.length; i++){
            System.out.println(arrayOfInts[i]);
        }

        int index = 0;
        for(int helpVar : arrayOfInts){
            System.out.println(helpVar);
            index++;
        }


    }
}
