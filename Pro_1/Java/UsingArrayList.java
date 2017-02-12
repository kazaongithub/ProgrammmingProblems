import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;


public class UsingArrayList
{
    public static boolean debug_flag = false;

    public static void main(String [] args)
    {
        int array_size = Integer.parseInt(args[0]);
        int number = Integer.parseInt(args[1]);

        int[] random_array = new int[array_size];

        Random r = new Random();
        for (int i = 0; i < array_size; ++i) {
            random_array[i] = r.nextInt(2 * array_size) + 1;
        }

        if (debug_flag) System.out.println(Arrays.toString(random_array));

        List finalList = new ArrayList();
        long start = System.currentTimeMillis();
        for (int i = 0; i < array_size; ++i) {
            if (random_array[i] > number)
                finalList.add(random_array[i]);
        }
        long end = System.currentTimeMillis();

        if (debug_flag) System.out.println(finalList.toString());

        System.out.print("ArraySize: " + array_size);
        System.out.println(", Time: " + (end - start) / 1000.0 + " Seconds");
    }
}
