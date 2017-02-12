import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class UsingSortedArray
{
    public static boolean debug_flag = false;

    public static void main(String [] args)
    {
        int array_size = Integer.parseInt(args[0]);
        int number = Integer.parseInt(args[1]);

        Integer[] random_array = new Integer[array_size];

        Random r = new Random();
        for (int i = 0; i < array_size; ++i) {
            random_array[i] = r.nextInt(2 * array_size) + 1;
        }

        if (debug_flag) System.out.println(Arrays.toString(random_array));

        int j = 0;
        List finalList = new ArrayList();
        long start = System.currentTimeMillis();
        Arrays.sort(random_array, Collections.reverseOrder());
        while(j < array_size && random_array[j] > number)  {
            finalList.add(random_array[j++]);
        }
        long end = System.currentTimeMillis();

        if (debug_flag) System.out.println(finalList.toString());

        System.out.print("ArraySize: " + array_size);
        System.out.println(", Time: " + (end - start) / 1000.0 + " Seconds");
    }
}
